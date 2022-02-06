package org.design.pattern.structural.adapter.ex2;

/**
 * Date: 09/11/21
 * Time: 6:39 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class CSVFormatAdapter implements CsvFormattable {

    private TextFormattable textFormattable;

    public CSVFormatAdapter(TextFormattable textFormattable) {
        this.textFormattable = textFormattable;
    }

    @Override
    public String format(String text) {
        return textFormattable.format(text);
    }
}
