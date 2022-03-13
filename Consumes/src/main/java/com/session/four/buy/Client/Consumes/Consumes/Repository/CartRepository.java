package com.session.four.buy.Client.Consumes.Consumes.Repository;

import com.session.four.buy.Client.Consumes.Consumes.Model.Entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
}
