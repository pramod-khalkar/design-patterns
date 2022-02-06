package org.design.pattern.behavioral.chain.ex1;

/**
 * Date: 20/11/21
 * Time: 6:12 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(RequestBody request) {
        if (request.getValue() > 0) {
            System.out.println("Provided number is positive");
        } else {
            super.process(request);
        }
    }
}
