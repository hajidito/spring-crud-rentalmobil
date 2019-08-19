package com.dito.rentalmobil.model;

import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mobil")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Car implements Serializable{
    
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String brand;
    
    @NotBlank
    private String licensePlateNumber;
    
    @NotBlank
    private String certificateVehicleNumber;
    
    @NotNull
    private int priceDay;

    private String tenantName;
    
    private String tenantIdentityNumber;
    
    private int longTimeRent;
    
    @Column(nullable = false, updatable = false)
    @Temporal (TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getCertificateVehicleNumber() {
        return certificateVehicleNumber;
    }

    public void setCertificateVehicleNumber(String certificateVehicleNumber) {
        this.certificateVehicleNumber = certificateVehicleNumber;
    }

    public int getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(int priceDay) {
        this.priceDay = priceDay;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantIdentityNumber() {
        return tenantIdentityNumber;
    }

    public void setTenantIdentityNumber(String tenantIdentityNumber) {
        this.tenantIdentityNumber = tenantIdentityNumber;
    }

    public int getLongTimeRent() {
        return longTimeRent;
    }

    public void setLongTimeRent(int longTimeRent) {
        this.longTimeRent = longTimeRent;
    }

}