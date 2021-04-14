package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.*;

@Repository
public interface TipoClienteRepository extends JpaRepository<TipoCliente , Integer> {

}
