package org.design.pattern.behavioral.chain.ex1;

/**
 * Date: 20/11/21
 * Time: 6:14 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Chain {

    private Processor processorChain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        processorChain = new NegativeProcessor(new PositiveProcessor(new ZeroProcessor(null)));
    }

    public void process(RequestBody request) {
        this.processorChain.process(request);
    }
}
