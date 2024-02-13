package com.gbw.kbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgersIngredientsRepository extends JpaRepository<com.gbw.kbapi.model.BurgersIngredients,Integer> {
}
