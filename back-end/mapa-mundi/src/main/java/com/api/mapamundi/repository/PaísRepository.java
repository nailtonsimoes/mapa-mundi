package com.api.mapamundi.repository;

import com.api.mapamundi.models.País;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA Repository vem com vários métodos para persistência: save, delete, findAll

public interface PaísRepository extends JpaRepository<País, Long> {



}
