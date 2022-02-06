package org.design.pattern.behavioral.mediator.ex2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Date: 20/11/21
 * Time: 10:21 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class AircraftTrafficControlRoom implements ControlRoom {

    private final LinkedList<Runway> availableRunways = new LinkedList<>();
    private final Map<Aircraft, Runway> aircraftRunwayMap = new HashMap<>();

    @Override
    public void registerRunway(Runway runway) {
        this.availableRunways.add(runway);
    }

    @Override
    public String allotRunwayTo(Aircraft aircraft) {
        Runway nextAvailableRunway = null;
        if (!this.availableRunways.isEmpty()) {
            nextAvailableRunway = availableRunways.removeFirst();
            aircraftRunwayMap.put(aircraft, nextAvailableRunway);
        }
        return nextAvailableRunway == null ? null : nextAvailableRunway.getName();
    }

    @Override
    public void releaseRunwayOccupiedBy(Aircraft aircraft) {
        if (this.aircraftRunwayMap.containsKey(aircraft)) {
            Runway releasedRunway = this.aircraftRunwayMap.remove(aircraft);
            this.availableRunways.add(releasedRunway);
        }
    }
}
