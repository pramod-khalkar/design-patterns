package org.design.pattern.structural.proxy.ex1;

/**
 * Date: 14/11/21
 * Time: 8:55 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("Image.png");
        proxyImage.display();

        //Will load from disk this time
        proxyImage.display();
    }
}
