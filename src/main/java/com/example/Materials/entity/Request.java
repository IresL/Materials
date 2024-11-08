package com.example.Materials.entity;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long materialId;
    private int quantityRequested;
    private String status;
    private LocalDateTime requestDate;

    // Getters and Setters
}

