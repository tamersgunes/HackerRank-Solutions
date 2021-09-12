package com.hackerrank.solutions.controller;

import com.hackerrank.solutions.service.twostrings.TwoStringsService;
import com.hackerrank.solutions.util.ApiConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TwoStringsController {
    private final TwoStringsService twoStringsService;

    public TwoStringsController(TwoStringsService twoStringsService) {
        this.twoStringsService = twoStringsService;
    }

    @PostMapping(value = ApiConstants.RESOLVE_TWO_STRINGS)
    public ResponseEntity<String> resolveStrings(String string1, String string2) {
        return new ResponseEntity<>(twoStringsService.twoStrings(string1, string2), null, HttpStatus.OK);
    }
}
