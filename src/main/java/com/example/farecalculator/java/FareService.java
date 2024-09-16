package com.example.farecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareService {
    @Autowired
    private FareRateRepository fareRateRepository;

    public double calculateFare(String vehicleType, int km) throws Exception {
        FareRate fareRate = fareRateRepository.findByVehicleType(vehicleType)
            .orElseThrow(() -> new Exception("Vehicle not found"));

        if (km <= 1) {
            return fareRate.getKm1();
        } else if (km == 2) {
            return fareRate.getKm2();
        } else if (km == 3) {
            return fareRate.getKm3();
        } else {
            double baseFareFor3Km = fareRate.getKm3();
            double additionalFarePerKm = (fareRate.getKm3() - fareRate.getKm2());
            return baseFareFor3Km + (km - 3) * additionalFarePerKm;
        }
    }
}

