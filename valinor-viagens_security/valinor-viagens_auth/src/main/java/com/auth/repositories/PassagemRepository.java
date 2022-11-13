package com.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.model.entities.Passagem;

@Repository
public interface PassagemRepository extends JpaRepository <Passagem, Long>{

}
