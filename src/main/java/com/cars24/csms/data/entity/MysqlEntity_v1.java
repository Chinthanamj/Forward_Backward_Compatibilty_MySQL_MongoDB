package com.cars24.csms.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class MysqlEntity_v1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="phone",nullable = false, unique = true)
    private String phone;

    @Column(name="email",nullable = false, unique = true)
    private String email;

    @Column(name="address",nullable = false)
    private String address;
}