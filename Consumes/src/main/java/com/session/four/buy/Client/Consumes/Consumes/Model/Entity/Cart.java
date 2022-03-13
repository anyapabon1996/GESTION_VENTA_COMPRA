package com.session.four.buy.Client.Consumes.Consumes.Model.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "quantity_to_buy")
    private Integer quantity;

    @Column(name = "price")
    private float price;

    public Cart(String name, Integer quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Cart() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
