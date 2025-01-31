package com.cars24.csms.controller;

import com.cars24.csms.data.entity.MongoEntity;
import com.cars24.csms.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo/services")
public class MongoController {
    @Autowired
    private MongoService serviceService;

    @PostMapping("/create")
    public MongoEntity createService(@RequestParam String name, @RequestParam double price, @RequestParam String description) {
        return serviceService.createService(name, price,description);
    }

    @GetMapping("/all")
    public List<MongoEntity> getAllServices() {
        return serviceService.getAllServices();
    }
}
