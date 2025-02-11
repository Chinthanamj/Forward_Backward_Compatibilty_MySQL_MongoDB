package com.cars24.csms.service;

import com.cars24.csms.data.documents.MongoEntity_v1;
import com.cars24.csms.data.repositories.MongoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MongoService {

    private final MongoRepo customerMongoRepository;

    public MongoEntity_v1 getCustomerByPhone(String phone) {
        return customerMongoRepository.findByPhone(phone)
                .orElseThrow(() -> new RuntimeException("No customer found with phone: " + phone));
    }

    public MongoEntity_v1 saveCustomer(MongoEntity_v1 customer) {
        return customerMongoRepository.save(customer);
    }
}
