package org.patterns.creational.builder.ex5;

/**
 * Date: 04/11/21
 * Time: 7:56 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder();
        Product sonyProduct = productBuilder.makeSonyProduct();
        System.out.printf("Products:%s\n Cost:%s", sonyProduct.showItems(), sonyProduct.getCost());
    }
}
