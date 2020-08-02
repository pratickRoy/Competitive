package com.extnds.competitive.problems.gasstation;

import com.extnds.competitive.problems.gasstation.data.CircularRouteDetails;
import com.extnds.competitive.problems.gasstation.data.StationDetails;

import java.util.Iterator;
import java.util.stream.IntStream;

public class GasStationProblemCleanSolution implements GasStationProblemSolution {

    @Override
    public int getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
        final int[] gasAtStationArray,
        final int[] gasToReachNextStationArray) {

        final CircularRouteDetails circularRouteDetails = new CircularRouteDetails(gasAtStationArray, gasToReachNextStationArray);

        return IntStream.range(0, circularRouteDetails.getStationCount())
            .parallel()
            .filter(stationId -> canRouteBeCompletedFromStartStation(circularRouteDetails, stationId))
            .min()
            .orElse(ROUTE_CANT_BE_COMPLETED_FLAG);
    }

    private boolean canRouteBeCompletedFromStartStation(final CircularRouteDetails circularRouteDetails,
                                                        final int startStationId) {

        int currentGasInTank = 0;
        final Iterator<StationDetails> iterator = circularRouteDetails.getSingleLoopIterator(startStationId);

        while (iterator.hasNext()) {

            final StationDetails currentStationDetails = iterator.next();
            if (currentGasInTank + currentStationDetails.getGasAtStation() < currentStationDetails.getGasToReachNextStation()) {
                return false;
            }
            currentGasInTank = currentGasInTank + currentStationDetails.getGasAtStation() - currentStationDetails.getGasToReachNextStation();
        }

        return true;
    }
}
