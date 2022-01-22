package org.patterns.creational.afp.ex2;

import java.util.Locale;
import org.pk.ground.design.creational.afp.ex2.mac.MacFactory;
import org.pk.ground.design.creational.afp.ex2.win.WindowsFactory;

/**
 * Date: 02/11/21
 * Time: 10:53 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    private static Application configuration() {
        String os = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        Application application = null;
        if (os.contains("mac")) {
            return new Application(new MacFactory());
        } else if (os.contains("win")) {
            return new Application(new WindowsFactory());
        }
        return application;
    }

    public static void main(String[] args) {
        Application application = configuration();
        assert application != null;
        application.paint();
    }
}
