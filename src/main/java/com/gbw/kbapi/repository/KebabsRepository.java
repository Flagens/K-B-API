package com.gbw.kbapi.repository;

import com.gbw.kbapi.model.Kebabs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KebabsRepository extends JpaRepository<Kebabs,Integer> {
}
