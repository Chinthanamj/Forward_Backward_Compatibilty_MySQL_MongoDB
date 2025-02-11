package com.cars24.csms.service;

import com.cars24.csms.data.entity.MysqlEntity_v1;
import com.cars24.csms.data.repositories.MySQLRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MySQLService {

    private final MySQLRepo customerRepository;

    public MysqlEntity_v1 getCustomerByPhone(String phone) {
        return customerRepository.findByPhone(phone)
                .orElseThrow(() -> new RuntimeException("No customer found with phone: " + phone));
    }

    public MysqlEntity_v1 saveCustomer(MysqlEntity_v1 customer) {
        return customerRepository.save(customer);
    }
}
