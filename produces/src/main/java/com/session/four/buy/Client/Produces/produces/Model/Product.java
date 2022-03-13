package com.session.four.buy.Client.Produces.produces.Model;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    @Positive(message = "Quantity must be grater than 0")
    private Integer quantity;

    @Column(name = "purachase_date")
    private LocalDate purchaseDate;

    @Column(name = "due_date")
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
