package com.catalisa.contabancaria.repository;

import com.catalisa.contabancaria.model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long > {
}
