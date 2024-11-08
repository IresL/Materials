package com.example.Materials.entity;



import javax.persistence.*;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int quantityReceived;
    private int quantityUsed;

    // Getters and Setters
}

