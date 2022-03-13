package com.session.four.buy.Client.Produces.produces.Controller;

import com.session.four.buy.Client.Produces.produces.Model.Product;
import com.session.four.buy.Client.Produces.produces.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/product/v1")
@Validated
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/createProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@Valid @RequestBody Product product) {
        return this.productService.createProduct(product);
    }

    @PostMapping("/createManyProducts")
    @ResponseStatus(HttpStatus.CREATED)
    public void manyProduct(@Valid @RequestBody List<Product> manyProducts){
        this.productService.addManyProducts(manyProducts);
    }

    @PutMapping("/modifyProduct/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public Product modifyQuantity(@PathVariable Integer productId, @RequestBody Product product){
        return this.productService.modifyProduct(productId, product);
    }

    @PutMapping("/modifyQuantityId/{productId}/quantity/{quantity}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean modifyQuantity(@PathVariable Integer productId, @PathVariable Integer quantity){
        return this.productService.modifyQuantity(productId, quantity);
    }

    @GetMapping("/getProductById/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public Product productByid(@PathVariable Integer productId){
        return this.productService.getProductById(productId);
    }

    @GetMapping("/getAllproducts")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> allProducts(){
        return this.productService.getAllProducts();
    }

    @DeleteMapping("/deleteProductById/{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteProduct(@PathVariable Integer productId){
        return this.productService.deleteProductById(productId);
    }

}
