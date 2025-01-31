package com.cars24.csms.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "services")
public class MongoEntity {
    @Id
    private String id;
    private String name;
    private double price;
    private String description;

    public MongoEntity(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

}
