package com.cars24.csms.service;
import com.cars24.csms.data.entity.MySQLEntity;
import com.cars24.csms.data.repositories.MySQLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MySQLService {
    @Autowired
    private MySQLRepo serviceRepository;

//    public MySQLEntity createService(String name, double price) {
//        return serviceRepository.save(new MySQLEntity(name, price));
//    }
//    public MySQLEntity createService(String name, double price, String description) {
//    return serviceRepository.save(new MySQLEntity(name, price, description));
//}


    public List<MySQLEntity> getAllServices() {
        return serviceRepository.findAll();
    }
}