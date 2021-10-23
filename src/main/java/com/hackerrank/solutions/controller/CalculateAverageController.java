package com.hackerrank.solutions.controller;

import com.hackerrank.solutions.service.calculateAverage.CalculatedAverageService;
import com.hackerrank.solutions.util.ApiConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculateAverageController {

    private final CalculatedAverageService calculatedAverageService;

    public CalculateAverageController(CalculatedAverageService calculatedAverageService) {
        this.calculatedAverageService = calculatedAverageService;
    }

    @PostMapping(value = ApiConstants.CALCULATE_AVERAGE)
    public ResponseEntity<Character> calculateAverage(Integer a, Integer b) {
        return new ResponseEntity<>(calculatedAverageService.calculate(a, b), null, HttpStatus.OK);
    }
}
