package com.extnds.competitive.problems.gasstation.data;

import com.extnds.competitive.datastructures.CircularList;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CircularRouteDetails {

    private final CircularList<StationDetails> stationDetailsCircularList;
    private final int stationCount;

    public CircularRouteDetails(final int[] gasAtStationArray, final int[] gasToReachNextStationArray) {

        if (gasAtStationArray.length != gasToReachNextStationArray.length) {
            throw new IllegalArgumentException("Route data is corrupt. Gas At Station Count != Gas To Reach Next Station Count");
        }

        stationCount = gasAtStationArray.length;
        stationDetailsCircularList = new CircularList<>(
            IntStream.range(0, stationCount)
                .boxed()
                .map(stationIndex -> new StationDetails(gasAtStationArray[stationIndex], gasToReachNextStationArray[stationIndex]))
                .collect(Collectors.toList())
        );
    }

    public int getStationCount() {
        return stationCount;
    }

    public Iterator<StationDetails> getSingleLoopIterator(final int startAt) {

        if (!stationDetailsCircularList.containsNodeAt(startAt)) {
            throw new IllegalArgumentException("Cannot Start Stream. Invalid Station Id.");
        }

        return stationDetailsCircularList.getSingleLoopIterator(startAt);
    }
}
