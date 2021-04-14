package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.escolaModel;
@Repository
public interface escolaRespository extends JpaRepository<escolaModel, Integer >{

}
