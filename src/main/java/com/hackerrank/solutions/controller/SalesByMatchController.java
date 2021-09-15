package com.hackerrank.solutions.controller;

import com.hackerrank.solutions.service.salesbymatch.SalesByMatchService;
import com.hackerrank.solutions.util.ApiConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SalesByMatchController {
    private final SalesByMatchService salesByMatchService;

    public SalesByMatchController(SalesByMatchService salesByMatchService) {
        this.salesByMatchService = salesByMatchService;
    }

    @PostMapping(value = ApiConstants.SALES_BY_MATCH)
    public ResponseEntity<Integer> resolveStrings(List<Integer> ar) {
        return new ResponseEntity<>(salesByMatchService.sockMerchant(ar), null, HttpStatus.OK);
    }
}
