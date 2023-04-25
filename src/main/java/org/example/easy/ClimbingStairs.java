package org.example.easy;

import java.util.List;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return n;
        }
        int oneStep = 1;
        int twoSteps = 2;
        int storage = 0;
        for (int i = 2; i < n; i++) {
                storage =  oneStep + twoSteps;
                oneStep = twoSteps;
                twoSteps = storage;
        }
        return twoSteps;
    }
}
