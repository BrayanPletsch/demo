package com.veiculo.demo.repository;

import com.veiculo.demo.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MotoRepository extends JpaRepository<Moto, Long> {
}

