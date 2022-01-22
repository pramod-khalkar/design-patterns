package org.patterns.structural.bridge.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 11/11/21
 * Time: 6:40 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class Vehicle {
    protected List<Workshop> workshops = new ArrayList<>();

    public Vehicle() {
        super();
    }

    protected boolean joinWorkshop(Workshop workshop) {
        return workshops.add(workshop);
    }

    abstract void manufacture();

    abstract int minWork();
}
