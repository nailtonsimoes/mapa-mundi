package com.api.mapamundi.repository;

import com.api.mapamundi.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository  extends JpaRepository<Pais, Long> {
    Pais findById(long id);

    void removeById(long id);
}
