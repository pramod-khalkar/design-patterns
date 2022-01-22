package org.patterns.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 4:54 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class LivingRoomFireTV4kStick extends Appliance {

    protected TV tv;
    protected String appName;
    protected String contentName;

    public LivingRoomFireTV4kStick(TV tv) {
        super("LivingRoomFIre4kStick");
        this.tv = tv;
    }

    public void openApp(String appName) {
        this.appName = appName;
        System.out.printf("Opening app %s on %s\n", appName, this.name);
    }

    public void selectContent(String contentName) {
        this.contentName = contentName;
        System.out.printf("Searching %s on %s \n", contentName, this.appName);
    }

    public void play() {
        System.out.printf("Playing %s on %s \n", this.contentName, this.appName);
    }

    public void closing() {
        System.out.printf("Closing %s on %s \n", this.appName, this.name);
    }

    public TV getTv() {
        return tv;
    }

    public String getAppName() {
        return appName;
    }

    public String getContentName() {
        return contentName;
    }
}
