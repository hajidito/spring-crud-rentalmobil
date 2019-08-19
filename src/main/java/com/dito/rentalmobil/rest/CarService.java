package com.dito.rentalmobil.rest;

import com.dito.rentalmobil.controller.CarController;
import com.dito.rentalmobil.model.Car;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/rentalmobil")
public class CarService {
    @Autowired
    private CarController cc;

    @GetMapping("/mobil")
    public List<Car> getAll(){
        return cc.getAll();
    }

    @PostMapping("/mobil")
    public Car addCar(@Valid @RequestBody Car car) {
        return cc.insertCar(car);
    }

    @PutMapping("/mobil/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable(value="id")Long id,
    @Valid @RequestBody Car detailCar){
        return cc.updateCar(id, detailCar);
    }

    @DeleteMapping("/mobil/{id}")
    public String deleteCar(@PathVariable (value="id") Long id){
        return cc.deleteCar(id);
    }

    @GetMapping("/mobil/{id}")
    public ResponseEntity<Optional<Car>> getCarById(@PathVariable(value = "id") Long id) {
        return cc.getCarById(id);
    }

    @GetMapping("/carimobil")
    public List<Car> sortCarByName(@RequestParam(value="name")String name){
        return cc.sortCarByName(name);
    }

    @GetMapping("/caripenyewa")
    public List<Car> sortCarByTenantName(@RequestParam(value="name")String name){
        return cc.sortCarByTenantName(name);
    }

}