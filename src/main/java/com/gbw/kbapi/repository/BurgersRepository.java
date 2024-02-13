package com.gbw.kbapi.repository;


import com.gbw.kbapi.model.Burgers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgersRepository extends JpaRepository<Burgers, Integer> {
}
