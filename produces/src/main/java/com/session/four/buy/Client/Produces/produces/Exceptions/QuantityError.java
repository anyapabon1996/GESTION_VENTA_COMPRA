package com.session.four.buy.Client.Produces.produces.Exceptions;

public class QuantityError extends RuntimeException{
    public QuantityError(Integer quantity){
        super("La cantidad debe ser mayor a cero: " + quantity);
    }
}
