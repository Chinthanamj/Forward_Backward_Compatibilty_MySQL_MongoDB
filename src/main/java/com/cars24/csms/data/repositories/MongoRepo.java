package com.cars24.csms.data.repositories;

import com.cars24.csms.data.documents.MongoEntity_v1;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface MongoRepo extends MongoRepository<MongoEntity_v1, String> {
    Optional<MongoEntity_v1> findByPhone(String phone);
}