package com.cars24.csms.data.documents;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "customers")
public class MongoEntity_v1 {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
