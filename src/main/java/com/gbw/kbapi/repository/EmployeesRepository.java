package com.gbw.kbapi.repository;

import com.gbw.kbapi.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {
}
