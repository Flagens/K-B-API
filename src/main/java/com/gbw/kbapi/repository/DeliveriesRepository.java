package com.gbw.kbapi.repository;

import com.gbw.kbapi.model.Deliveries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveriesRepository extends JpaRepository<Deliveries,Integer> {
}
