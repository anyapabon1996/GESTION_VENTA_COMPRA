package com.session.four.buy.Client.Consumes.Consumes.Exception;

public class ProductInCartNotFound extends RuntimeException{
    public ProductInCartNotFound(Integer id){
        super("No se encuentra en su carrito producto con id: " + id);
    }
}
