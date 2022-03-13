package com.session.four.buy.Client.Consumes.Consumes.Repository;

import com.session.four.buy.Client.Consumes.Consumes.Model.Payload.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("session.four.eureka.produces.products")
public interface FeignRepository {

    //ESTO DE ACA APUNTA AL ENDPOINT DE CLIENTE2
    @RequestMapping(value = "/api/product/v1/getProductById/{productId}", method = RequestMethod.GET)
    public Product productById(@PathVariable Integer productId);

    @RequestMapping(value = "/api/product/v1/modifyQuantityId/{productId}/quantity/{quantity}", method = RequestMethod.PUT)
    public Boolean modifyQuantityById(@PathVariable Integer productId, @PathVariable Integer quantity);
}
