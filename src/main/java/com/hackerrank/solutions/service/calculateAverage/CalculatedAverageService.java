package com.hackerrank.solutions.service.calculateAverage;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatedAverageService {
    private int[] testScores;


    public char calculate(int a, int b) {
        int[] testScores = {a, b};
        List<Integer> intList = new ArrayList<Integer>(testScores.length);
        for (int i : testScores) {
            intList.add(i);
        }
        int count = intList.size();
        int sum = intList.stream().mapToInt(i -> i).sum();
        int avg = sum / count;
        char letterGrade = ' ';
        if (avg >= 90 && avg <= 100) {
            letterGrade = 'O';
        } else if (avg >= 80 && avg < 90) {
            letterGrade = 'E';
        } else if (avg >= 70 && avg < 80) {
            letterGrade = 'A';
        } else if (avg >= 55 && avg < 70) {
            letterGrade = 'P';
        } else if (avg >= 40 && avg < 90) {
            letterGrade = 'D';
        } else if (avg < 40) {
            letterGrade = 'T';
        }
        return letterGrade;
    }
}
