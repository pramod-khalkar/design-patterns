package org.patterns.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 5:03 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class LivingRoomSoundBar extends SoundBar {

    protected TV tv;

    public LivingRoomSoundBar(TV tv) {
        super("LivingRoomSoundBar");
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }
}
