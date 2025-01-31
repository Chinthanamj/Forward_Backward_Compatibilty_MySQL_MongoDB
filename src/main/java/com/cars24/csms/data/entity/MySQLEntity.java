package com.cars24.csms.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "services")
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class MySQLEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false)
    private double price;

    public MySQLEntity(){}

    public MySQLEntity(String name, double price) {
        this.name = name;
        this.price = price;
}}



