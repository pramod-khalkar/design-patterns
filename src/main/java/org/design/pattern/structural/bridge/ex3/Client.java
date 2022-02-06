package org.design.pattern.structural.bridge.ex3;

/**
 * Date: 11/11/21
 * Time: 6:54 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkshop());
        bike.joinWorkshop(new PaintWorkshop());

        bike.manufacture();
    }
}
