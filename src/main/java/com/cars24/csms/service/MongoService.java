package com.cars24.csms.service;

import com.cars24.csms.data.entity.MongoEntity;
import com.cars24.csms.data.repositories.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {
    @Autowired
    private MongoRepo serviceRepository;

//    public MongoEntity createService(String name, double price) {
//        return serviceRepository.save(new MongoEntity(name, price));
//    }


    public MongoEntity createService(String name, double price, String description) {
        return serviceRepository.save(new MongoEntity(name, price, description));
    }

    public List<MongoEntity> getAllServices() {
        return serviceRepository.findAll();
    }
}
