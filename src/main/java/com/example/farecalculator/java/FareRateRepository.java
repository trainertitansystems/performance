package com.example.farecalculator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FareRateRepository extends JpaRepository<FareRate, String> {
    Optional<FareRate> findByVehicleType(String vehicleType);
}

