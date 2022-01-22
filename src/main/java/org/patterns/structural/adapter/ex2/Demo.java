package org.patterns.structural.adapter.ex2;

/**
 * Date: 08/11/21
 * Time: 11:22 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        String text = "This is testing text.We are checking formatting.Hope will work.";
        TextFormattable textFormattable = new NewLineFormatter();
        System.out.println(textFormattable.format(text));

        CsvFormattable csvFormattable = new CSVFormatter();
        System.out.println(csvFormattable.format(text));


        CSVFormatAdapter csvFormatAdapter = new CSVFormatAdapter(textFormattable);
        System.out.println(csvFormatAdapter.format(text));
    }
}
