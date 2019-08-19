package com.dito.rentalmobil.controller;

import com.dito.rentalmobil.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarRepository cr;

    public List<Car> getAll(){
        return cr.findAll();
    }

    public Car insertCar(Car car){
        return cr.save(car);
    }

    public ResponseEntity<Car> updateCar(Long id, Car detailCar){
        Car car = cr.getOne(id);
        if(car == null){
            return ResponseEntity.notFound().build();
        }
        car.setName(detailCar.getName());
        car.setBrand(detailCar.getBrand());
        car.setLicensePlateNumber(detailCar.getLicensePlateNumber());
        car.setCertificateVehicleNumber(detailCar.getCertificateVehicleNumber());
        car.setPriceDay(detailCar.getPriceDay());
        car.setTenantName(detailCar.getTenantName());
        car.setTenantIdentityNumber(detailCar.getTenantIdentityNumber());
        car.setLongTimeRent(detailCar.getLongTimeRent());
        Car updatedCar = cr.save(car);
        return ResponseEntity.ok(updatedCar);
    }

    public String deleteCar(Long id){
        Car car = cr.getOne(id);
        String result = "";
        if(car == null) {
            result = "mobil dengan id "+id+" tidak ditemukan";
            return result;
        }
        else{
            result = "mobil dengan id "+id+" berhasil di hapus";
            cr.deleteById(id);
            return result;
        } 
    }
    
    public ResponseEntity<Optional<Car>> getCarById(Long id) {
        Optional<Car> car = cr.findById(id);
        if(car == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(car);
    }

    public List<Car> sortCarByName(String name){
        return cr.findByName(name);
    }

    public List<Car> sortCarByTenantName(String tenantName){
        return cr.findByTenantName(tenantName);
    }

}