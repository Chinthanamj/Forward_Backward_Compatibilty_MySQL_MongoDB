package com.cars24.csms.controller;

import com.cars24.csms.data.entity.MysqlEntity_v1;
import com.cars24.csms.service.MySQLService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class MysqlController {

    private final MySQLService customerService;

    @PostMapping("/save")
    public MysqlEntity_v1 saveCustomer(@RequestBody MysqlEntity_v1 customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/get")
    public MysqlEntity_v1 getCustomer(@RequestParam String phone) {
        return customerService.getCustomerByPhone(phone);
    }
}
