package com.esen.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Entity
@Data
@AllArgsConstructor
public class Bookstore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String location;
    private Double priceModifier;
    private Double moneyInCashRegister;

    @ElementCollection(fetch = FetchType.EAGER)
    @JsonIgnore
    private Map<Book, Integer> inventory;

}
