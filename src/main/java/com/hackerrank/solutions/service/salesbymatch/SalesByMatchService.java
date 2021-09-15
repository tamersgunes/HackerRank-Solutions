package com.hackerrank.solutions.service.salesbymatch;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesByMatchService {
    public int sockMerchant(List<Integer> ar) {
        int result = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = (i + 1); j < ar.size(); j++) {
                if (ar.get(i).equals(ar.get(j))) {
                    ar.remove(i);
                    ar.remove(j - 1);
                    result++;
                    i--;
                    break;
                }
            }
        }
        return result;
    }
}
