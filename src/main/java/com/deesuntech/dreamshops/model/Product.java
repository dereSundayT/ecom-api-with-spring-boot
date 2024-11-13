package com.deesuntech.dreamshops.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;



@Getter
@Setter
//@AllArgsConstructor :: No need to add this annotation because we have a constructor with  the necessary fields
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;

    //Category: Relationships is going to be deleted when the parent is deleted
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    //Images: Images are going to be deleted when the parent is deleted
    @OneToMany(mappedBy = "product",cascade= CascadeType.ALL,orphanRemoval=true)
    private List<Image> images;

    public Product(String name,String brand,BigDecimal price, int inventory, String description, Category category) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.inventory = inventory;
        this.price = price;
        this.brand = brand;
    }
}
