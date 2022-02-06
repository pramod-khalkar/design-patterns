package org.design.pattern.creational.builder.ex5;

/**
 * Date: 04/11/21
 * Time: 7:53 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ProductBuilder {

    public Product makeSonyProduct() {
        Product product = new Product();
        product.addItems(new SonyCD());
        product.addItems(new SonyDigiRecorder());
        return product;
    }

    public Product makeSamsumProduct() {
        Product product = new Product();
        product.addItems(new SamsungCD());
        product.addItems(new SamsunDigiRecorder());
        return product;
    }
}
