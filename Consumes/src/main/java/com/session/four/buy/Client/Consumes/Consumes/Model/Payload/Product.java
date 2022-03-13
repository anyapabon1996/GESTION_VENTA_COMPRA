package com.session.four.buy.Client.Consumes.Consumes.Model.Payload;

import java.time.LocalDate;

public class Product {

    private Integer id;
    private String name;
    private String description;
    private Integer quantity;
    private LocalDate purchaseDate;
    private LocalDate dueDate;

    public Product(String name, String description, Integer quantity, LocalDate purchaseDate, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.dueDate = dueDate;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Porduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", purchaseDate=" + purchaseDate +
                ", dueDate=" + dueDate +
                '}';
    }
}
