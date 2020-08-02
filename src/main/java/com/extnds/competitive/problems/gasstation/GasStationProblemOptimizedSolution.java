package com.extnds.competitive.problems.gasstation;

public class GasStationProblemOptimizedSolution implements GasStationProblemSolution {

    @Override
    public int getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
        int[] gasAtStationArray,
        int[] gasToReachNextStationArray) {

        int minTotal = 0;
        int minTotalIndex = -1;
        int total = 0;
        for (int i = 0; i < gasAtStationArray.length; i++) {
            total += gasAtStationArray[i] - gasToReachNextStationArray[i];
            if(total < minTotal) {
                minTotal = total;
                minTotalIndex = i;
            }
        }
        return total < 0 ? ROUTE_CANT_BE_COMPLETED_FLAG : (minTotalIndex + 1);
    }
}
