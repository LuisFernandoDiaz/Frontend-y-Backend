package com.example.reniec.repository;

import com.example.reniec.modelo.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRegistroRepository extends JpaRepository<Registro, Integer> {
}
