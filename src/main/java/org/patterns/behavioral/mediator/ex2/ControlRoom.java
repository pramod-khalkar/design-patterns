package org.patterns.behavioral.mediator.ex2;

/**
 * Date: 20/11/21
 * Time: 10:14 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public interface ControlRoom {
    void registerRunway(Runway runway);

    String allotRunwayTo(Aircraft aircraft);

    void releaseRunwayOccupiedBy(Aircraft aircraft);
}
