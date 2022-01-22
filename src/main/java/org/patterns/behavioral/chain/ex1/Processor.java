package org.patterns.behavioral.chain.ex1;

/**
 * Date: 20/11/21
 * Time: 6:06 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class Processor {

    private final Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(RequestBody request) {
        if (this.processor != null) {
            this.processor.process(request);
        }
    }
}
