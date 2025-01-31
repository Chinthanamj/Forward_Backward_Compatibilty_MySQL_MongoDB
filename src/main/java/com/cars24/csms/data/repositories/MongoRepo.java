package com.cars24.csms.data.repositories;

import com.cars24.csms.data.entity.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<MongoEntity, String> {
}
