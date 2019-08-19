package com.dito.rentalmobil.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dito.rentalmobil.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByName(String name);
	List<Car> findByTenantName(String tenantName);
}