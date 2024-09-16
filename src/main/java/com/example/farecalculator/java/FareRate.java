package com.example.farecalculator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fare_rates")
public class FareRate {
    @Id
    private String vehicleType;
    private double km1;
    private double km2;
    private double km3;

    // Getters and setters
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getKm1() {
        return km1;
    }

    public void setKm1(double km1) {
        this.km1 = km1;
    }

    public double getKm2() {
        return km2;
    }

    public void setKm2(double km2) {
        this.km2 = km2;
    }

    public double getKm3() {
        return km3;
    }

    public void setKm3(double km3) {
        this.km3 = km3;
    }
}

