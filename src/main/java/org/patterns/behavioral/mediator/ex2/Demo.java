package org.patterns.behavioral.mediator.ex2;

/**
 * Date: 20/11/21
 * Time: 10:39 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        ControlRoom controlRoom = new AircraftTrafficControlRoom();

        Runway runway = new Runway("Runway_A");
        controlRoom.registerRunway(runway);

        AircraftColleague lh100 = new Aircraft(controlRoom, "LH-100");
        AircraftColleague lh200 = new Aircraft(controlRoom, "LH-200");

        lh100.startLanding();
        lh200.startLanding();
        lh100.finishLanding();
    }
}
