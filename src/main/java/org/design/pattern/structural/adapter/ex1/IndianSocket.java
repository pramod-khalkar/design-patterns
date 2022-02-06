package org.design.pattern.structural.adapter.ex1;

/**
 * Date: 08/11/21
 * Time: 5:40 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class IndianSocket {

    public void plugIn(IndianPlugConnector indianPlugConnector) {
        indianPlugConnector.giveElectricity();
    }
}
