package org.patterns.behavioral.chain.ex1;

/**
 * Date: 20/11/21
 * Time: 6:11 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(RequestBody request) {
        if (request.getValue() < 0) {
            System.out.println("Provide number is negative");
        } else {
            super.process(request);
        }
    }
}
