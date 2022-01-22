package org.patterns.structural.adapter.ex1;

/**
 * Date: 08/11/21
 * Time: 5:42 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class GermanToIndiaAdapter implements IndianPlugConnector {

    private final GermanPlugConnector germanPlugConnector;

    public GermanToIndiaAdapter(GermanPlugConnector germanPlugConnector) {
        this.germanPlugConnector = germanPlugConnector;
    }

    @Override
    public void giveElectricity() {
        germanPlugConnector.giveElectricity();
    }
}
