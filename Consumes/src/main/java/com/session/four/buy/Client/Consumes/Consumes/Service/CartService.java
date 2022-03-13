package com.session.four.buy.Client.Consumes.Consumes.Service;

import com.session.four.buy.Client.Consumes.Consumes.Exception.ProductInCartNotFound;
import com.session.four.buy.Client.Consumes.Consumes.Model.Entity.Cart;
import com.session.four.buy.Client.Consumes.Consumes.Model.Payload.Product;
import com.session.four.buy.Client.Consumes.Consumes.Repository.CartRepository;
import com.session.four.buy.Client.Consumes.Consumes.Repository.FeignRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    FeignRepository feignRepository;

    @Autowired
    CartRepository cartRepository;

    public Product getProductById(Integer id){
        return this.feignRepository.productById(id);
    }

    public Boolean addProductToCart(Integer id, Integer quantiy){
        Product prod = this.feignRepository.productById(id);

        if(prod != null){
            if(prod.getQuantity() > quantiy) {
                this.feignRepository.modifyQuantityById(id, quantiy);
                Cart cart = new Cart();
                cart.setName(prod.getName());
                cart.setPrice((float) 102.3);
                cart.setQuantity(quantiy);
                this.cartRepository.save(cart);
                return true;
            } else return false;
        }
        return false;
    }

    public Cart getProductInCartById(Integer id){
        return  this.cartRepository.findById(id)
                    .orElseThrow(()-> new ProductInCartNotFound(id));
    }
}
