package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.enderecoModel;


@Repository
public interface enderecoRepository extends JpaRepository<enderecoModel, Integer>{

}
