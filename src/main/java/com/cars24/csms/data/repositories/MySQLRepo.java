package com.cars24.csms.data.repositories;

import com.cars24.csms.data.entity.MySQLEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLRepo extends JpaRepository<MySQLEntity,Long> {
}
