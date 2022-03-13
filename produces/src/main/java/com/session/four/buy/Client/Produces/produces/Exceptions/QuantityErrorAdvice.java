package com.session.four.buy.Client.Produces.produces.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class QuantityErrorAdvice {

    @ResponseBody
    @ExceptionHandler(QuantityError.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String quantityBadRequestHandler(QuantityError ex){
        return ex.getMessage();
    }
}
