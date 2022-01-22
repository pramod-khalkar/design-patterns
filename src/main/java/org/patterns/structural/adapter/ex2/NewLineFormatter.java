package org.patterns.structural.adapter.ex2;

/**
 * Date: 08/11/21
 * Time: 11:18 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class NewLineFormatter implements TextFormattable {

    @Override
    public String format(String text) {
        return text.replace(".", "\n");
    }
}
