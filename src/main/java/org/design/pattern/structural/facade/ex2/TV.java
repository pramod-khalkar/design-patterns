package org.design.pattern.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 4:18 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class TV extends Appliance {

    public static final int TOP_VOLUME = 30;
    public static final int LOW_VOLUME = 0;
    public static final int TOP_CHANNEL = 999;
    public static final int LOW_CHANNEL = 1;

    protected int currentVolume = 1;
    protected int currentChannel = 1;
    protected int volumeWhenMute;

    public TV(String name) {
        super(name);
    }

    public void increaseVolume() {
        if (currentChannel < TOP_VOLUME) {
            currentVolume++;
            System.out.printf("%s volume increased to %d \n", this.name, this.currentVolume);
        } else {
            System.out.printf("%s volume already set to top\n", this.name);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > LOW_VOLUME) {
            currentVolume--;
            System.out.printf("%s volume decreased to %d\n", this.name, this.currentVolume);
        } else {
            System.out.printf("%s volume already set to low\n", this.name);
        }
    }

    public void mute() {
        if (currentVolume != LOW_VOLUME) {
            volumeWhenMute = currentVolume;
            currentVolume = 0;
            System.out.printf("%S setting volume to mute\n", this.name);
        } else {
            currentVolume = volumeWhenMute;
            System.out.printf("%s unmute and setting volume to %d\n", this.name, currentVolume);
        }
    }

    public void increaseChannel() {
        if (currentChannel < TOP_CHANNEL) {
            currentChannel++;
            System.out.printf("%s increasing channel to %d \n", this.name, currentChannel);
        } else {
            System.out.printf("%s already showing channel %d \n", this.name, this.currentChannel);
        }
    }

    public void decreaseChannel() {
        if (currentChannel > LOW_CHANNEL) {
            currentChannel--;
            System.out.printf("%s decreasing channel to %d \n", this.name, this.currentChannel);
        } else {
            System.out.printf("%s already showing channel %d \n", this.name, this.currentChannel);
        }
    }
}
