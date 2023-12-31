package com.abhishekanand.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity( name = "Product")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product {

    @Id
    private int id;

    private String name;
    private String description;
    private int price;
}
