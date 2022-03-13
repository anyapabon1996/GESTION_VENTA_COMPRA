package com.session.four.buy.Client.Produces.produces.Exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Integer id){
        super("Product " + id + ": NOT FOUND");
    }
}
