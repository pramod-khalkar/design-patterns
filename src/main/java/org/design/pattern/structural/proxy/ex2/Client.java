package org.design.pattern.structural.proxy.ex2;

import java.util.stream.IntStream;

/**
 * Date: 14/11/21
 * Time: 9:05 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyOfficeInternetAccess("Pramod");
        IntStream.range(0, 4).forEach(value -> access.grandInternetAccess());
    }
}
