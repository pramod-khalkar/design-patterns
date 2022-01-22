package org.patterns.structural.proxy.ex2;

/**
 * Date: 14/11/21
 * Time: 9:17 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class RealInternetOfficeAccess implements OfficeInternetAccess {

    private String empName;

    public RealInternetOfficeAccess(String empName) {
        this.empName = empName;
    }

    @Override
    public void grandInternetAccess() {
        System.out.printf("Granting internet access to %s \n", this.empName);
    }
}
