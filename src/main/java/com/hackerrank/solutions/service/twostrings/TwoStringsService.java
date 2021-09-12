package com.hackerrank.solutions.service.twostrings;

import org.springframework.stereotype.Service;

@Service
public class TwoStringsService {
    public String twoStrings(String s1, String s2) {
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                return "YES";
            }
        }
        return "NO";
    }
}
