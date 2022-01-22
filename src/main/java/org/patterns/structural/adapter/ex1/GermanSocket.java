package org.patterns.structural.adapter.ex1;

/**
 * Date: 08/11/21
 * Time: 5:38 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class GermanSocket {

    public void plugIn(GermanPlugConnector germanPlugConnector) {
        germanPlugConnector.giveElectricity();
    }
}