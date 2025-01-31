package com.cars24.csms.controller;


import com.cars24.csms.data.entity.MongoEntity;
import com.cars24.csms.data.entity.MySQLEntity;
import com.cars24.csms.service.MySQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mysql/services")
public class MySQLController {
    @Autowired
    private MySQLService serviceService;

//    @PostMapping("/create")
//    public MySQLEntity createService(@RequestParam String name, @RequestParam double price, @RequestParam String description) {
//        return serviceService.createService(name, price,description);
//    }


    @GetMapping("/all")
    public List<MySQLEntity> getAllServices() {
        return serviceService.getAllServices();
    }
}


