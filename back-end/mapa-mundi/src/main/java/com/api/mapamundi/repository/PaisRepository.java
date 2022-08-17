package com.api.mapamundi.repository;

import com.api.mapamundi.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA Repository vem com vários métodos para persistência: save, delete, findAll

public interface PaisRepository extends JpaRepository<Pais, Long> {



}
