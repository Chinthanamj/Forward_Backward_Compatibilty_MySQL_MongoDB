package com.cars24.csms.data.repositories;


import com.cars24.csms.data.entity.MysqlEntity_v1;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MySQLRepo extends JpaRepository<MysqlEntity_v1, Integer> {
    Optional<MysqlEntity_v1> findByPhone(String phone);
}