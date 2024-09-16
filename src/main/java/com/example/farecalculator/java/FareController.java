package com.example.farecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fare")
public class FareController {
    @Autowired
    private FareService fareService;

    @GetMapping("/{vehicleType}/{km}")
    public ResponseEntity<Double> getFare(@PathVariable String vehicleType, @PathVariable int km) {
        try {
            double fare = fareService.calculateFare(vehicleType, km);
            return new ResponseEntity<>(fare, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}

