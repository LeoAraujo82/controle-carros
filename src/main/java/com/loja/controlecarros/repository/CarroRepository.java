package com.loja.controlecarros.repository;

import com.loja.controlecarros.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
