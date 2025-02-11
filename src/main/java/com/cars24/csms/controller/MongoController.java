package com.cars24.csms.controller;

import com.cars24.csms.data.documents.MongoEntity_v1;
import com.cars24.csms.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/mongo") // Separate endpoint for MongoDB
@RequiredArgsConstructor
public class MongoController {

    private final MongoService customerMongoService;

    @PostMapping("/save")
    public MongoEntity_v1 saveCustomer(@RequestBody MongoEntity_v1 customer) {
        return customerMongoService.saveCustomer(customer);
    }

    @GetMapping("/get")
    public MongoEntity_v1 getCustomer(@RequestParam String phone) {
        return customerMongoService.getCustomerByPhone(phone);
    }
}
