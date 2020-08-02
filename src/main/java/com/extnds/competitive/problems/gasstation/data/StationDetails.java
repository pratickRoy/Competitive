package com.extnds.competitive.problems.gasstation.data;

public class StationDetails {

    private final int gasAtStation;
    private final int gasToReachNextStation;

    public StationDetails(final int gasAtStation, final int gasToReachNextStation) {

        this.gasAtStation = gasAtStation;
        this.gasToReachNextStation = gasToReachNextStation;
    }

    public int getGasAtStation() {
        return gasAtStation;
    }

    public int getGasToReachNextStation() {
        return gasToReachNextStation;
    }
}
