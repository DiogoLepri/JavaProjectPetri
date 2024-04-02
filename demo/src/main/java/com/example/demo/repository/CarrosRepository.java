package com.example.demo.repository;

import com.example.demo.model.Carros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrosRepository extends JpaRepository<Carros,Long> {
}
