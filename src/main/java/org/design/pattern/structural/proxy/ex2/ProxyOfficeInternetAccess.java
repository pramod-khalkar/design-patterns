package org.design.pattern.structural.proxy.ex2;

import java.util.Random;

/**
 * Date: 14/11/21
 * Time: 9:18 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ProxyOfficeInternetAccess implements OfficeInternetAccess {

    private final String empName;
    private RealInternetOfficeAccess realInternetOfficeAccess;
    private final Random random;

    public ProxyOfficeInternetAccess(String empName) {
        this.empName = empName;
        this.random = new Random(6);
    }

    @Override
    public void grandInternetAccess() {
        if (getJobLevel(this.empName) > 4) {
            if (this.realInternetOfficeAccess == null) {
                this.realInternetOfficeAccess = new RealInternetOfficeAccess(this.empName);
            }
            this.realInternetOfficeAccess.grandInternetAccess();
        } else {
            System.out.printf("Not able to provide access to %s , job level below 4 \n", this.empName);
        }
    }

    private int getJobLevel(String empName) {
        return random.nextInt();
    }
}
