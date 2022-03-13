package com.session.four.buy.Client.Produces.produces.Repository;

import com.session.four.buy.Client.Produces.produces.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
