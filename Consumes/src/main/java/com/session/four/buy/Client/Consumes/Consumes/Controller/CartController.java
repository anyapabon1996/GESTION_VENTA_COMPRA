package com.session.four.buy.Client.Consumes.Consumes.Controller;

import com.netflix.discovery.converters.Auto;
import com.session.four.buy.Client.Consumes.Consumes.Model.Entity.Cart;
import com.session.four.buy.Client.Consumes.Consumes.Model.Payload.Product;
import com.session.four.buy.Client.Consumes.Consumes.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart/vi")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/getProductById/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public Product getProductById(@PathVariable Integer productId){
        return this.cartService.getProductById(productId);
    }

    @GetMapping("/getProductInCartById/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public Cart getProductInCartById(@PathVariable Integer productId){
        return this.cartService.getProductInCartById(productId);
    }

    @PostMapping("/addProduct/productId/{productId}/quantityToBy/{quantity}")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addProductToCArt(@PathVariable Integer productId, @PathVariable Integer quantity){
        return this.cartService.addProductToCart(productId, quantity);
    }
}
