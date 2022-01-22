package org.patterns.behavioral.mediator.ex2;

/**
 * Date: 20/11/21
 * Time: 10:15 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Aircraft implements AircraftColleague {

    private final ControlRoom controlRoom;
    private final String flightName;

    public Aircraft(ControlRoom controlRoom, String flightName) {
        this.controlRoom = controlRoom;
        this.flightName = flightName;
    }

    @Override
    public void startLanding() {
        String runway = this.controlRoom.allotRunwayTo(this);
        if (runway == null) {
            System.out.printf("Due to traffic there is a delay in landing flight %s \n", this.flightName);
        } else {
            System.out.printf("Currently flight %s landing on %s runway \n", this.flightName, runway);
        }
    }

    @Override
    public void finishLanding() {
        System.out.printf("%s flight landed successfully", this.flightName);
        this.controlRoom.releaseRunwayOccupiedBy(this);
    }
}
