package com.bnt.tasks;

public class EquilibriumPoint {
    public int equilibriumPoint(int[] arg, int n) {
        if (n == 1) return 1;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < n; i++) {
            rightSum += arg[i];
        }
        for (int i = 0; i < n - 1; i++) {
            if (leftSum == rightSum)
                return i + 1;
            leftSum = leftSum + arg[i];
            rightSum = rightSum - arg[i + 1];
        }
        return 0;
    }

}
