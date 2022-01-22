package org.patterns.structural.adapter.ex2;

/**
 * Date: 08/11/21
 * Time: 11:21 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class CSVFormatter implements CsvFormattable {

    @Override
    public String format(String text) {
        return text.replace(".", ",");
    }
}
