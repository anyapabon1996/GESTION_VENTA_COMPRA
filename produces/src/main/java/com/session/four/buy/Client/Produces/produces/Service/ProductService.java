package com.session.four.buy.Client.Produces.produces.Service;

import com.session.four.buy.Client.Produces.produces.Exceptions.ProductNotFoundException;
import com.session.four.buy.Client.Produces.produces.Exceptions.QuantityError;
import com.session.four.buy.Client.Produces.produces.Model.Product;
import com.session.four.buy.Client.Produces.produces.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product createProduct(Product product){
//        return product.getQuantity()>0 ? this.productRepository.save(product) : new QuantityError(product.getQuantity());
          return this.productRepository.save(product);
    }

    public Product modifyProduct(Integer id, Product product){
        return this.productRepository.findById(id)
                .map(prod -> {
                    prod.setDueDate(product.getDueDate());
                    prod.setPurchaseDate((product.getPurchaseDate()));
                    prod.setQuantity(product.getQuantity());
                    prod.setDescription(product.getDescription());
                    prod.setName(product.getName());
                    return this.productRepository.save(prod);
                }).orElseGet(()-> {
                    return this.productRepository.save(product);
        });
    }

    public Boolean modifyQuantity(Integer id, Integer quantity){
        Product productToModify = this.productRepository.findById(id).orElse(null);

       if(productToModify != null) {
           productToModify.setQuantity(productToModify.getQuantity() - quantity);
           this.productRepository.save(productToModify);
           return true;
       }else
           return false;
    }

    public void addManyProducts(List<Product> manyProducts){
        this.productRepository.saveAll(manyProducts);
    }

    public Product getProductById(Integer id){
        return this.productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public List<Product> getAllProducts(){
        return (List<Product>) this.productRepository.findAll();
    }

    public Boolean deleteProductById(Integer id){
        Product product = this.productRepository.findById(id).orElse(null);
        if (product != null){
            this.productRepository.deleteById(id);
            return true;
        } else return false;
    }

}
