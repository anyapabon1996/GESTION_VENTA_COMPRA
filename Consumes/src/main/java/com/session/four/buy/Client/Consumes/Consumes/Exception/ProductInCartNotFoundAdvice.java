package com.session.four.buy.Client.Consumes.Consumes.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductInCartNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ProductInCartNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ProductInCartNotFoundHandler(ProductInCartNotFound ex){
        return ex.getMessage();
    }
}
