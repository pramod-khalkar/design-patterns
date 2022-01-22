package org.patterns.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 3:46 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class SoundBar extends Appliance {
    public static final int TOP_VALUME = 30;
    public static final int LOW_VALUME = 0;

    protected String soundMode;
    protected int currentVolume = 1;
    protected int volumeWhenMute;

    public SoundBar(String name) {
        super(name);
    }

    public void setSoundMode(String soundMode) {
        this.soundMode = soundMode;
        System.out.printf("Setting sound mode of %s to %s \n", this.soundMode, this.name);
    }

    public void increaseVolume() {
        if (currentVolume < TOP_VALUME) {
            currentVolume++;
            System.out.printf("%s volum increased to %d\n", this.name, currentVolume);
        } else {
            System.out.printf("%s volume already high\n", this.name);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > LOW_VALUME) {
            currentVolume--;
            System.out.printf("%s volume decreased to %d \n", this.name, currentVolume);
        } else {
            System.out.printf("%s volume already to lowes\n", this.name);
        }
    }

    public void volume(int volume) {
        if (volume >= LOW_VALUME && volume <= TOP_VALUME) {
            currentVolume = volume;
            System.out.printf("%s setting volume to %d\n", this.name, currentVolume);
        } else {
            System.out.printf("%s supported range %d to %d\n", this.name, LOW_VALUME, TOP_VALUME);
        }
    }

    public void mute() {
        if (currentVolume != LOW_VALUME) {
            volumeWhenMute = currentVolume;
            currentVolume = 0;
            System.out.printf("%s setting on mute \n", this.name);
        } else {
            currentVolume = volumeWhenMute;
            System.out.printf("%s setting volume back to %d \n", this.name, currentVolume);
        }
    }

    public String getSoundMode() {
        return soundMode;
    }
}
