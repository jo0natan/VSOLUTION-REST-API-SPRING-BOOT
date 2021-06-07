package com.jonatan.springboot.rest.jonatan;

import com.jonatan.springboot.rest.model.Empresas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JonatanRepository extends JpaRepository<Empresas, Integer> {

}