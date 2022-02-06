package org.design.pattern.structural.facade.ex2;

import java.util.List;

/**
 * Date: 13/11/21
 * Time: 5:07 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Home {

    private Fan fan;
    private LivingRoomFireTV4kStick stick;
    private Light livingRoomLight;
    private SoundBar soundBar;
    private TV tv;

    private CoffeeMaker coffeeMaker;
    private ElectricGrill electricGrill;
    private Light kitchenLight;
    private Microwave microwave;
    private Refrigerator refrigerator;

    public Home() {
        super();
        fan = new LivingRoomFan();
        tv = new LivingRoomTV();
        stick = new LivingRoomFireTV4kStick(tv);
        livingRoomLight = new LivingRoomLight();
        soundBar = new LivingRoomSoundBar(tv);

        coffeeMaker = new CoffeeMaker();
        electricGrill = new ElectricGrill();
        kitchenLight = new KitchenLight();
        microwave = new Microwave();
        refrigerator = new Refrigerator();
    }

    public void playMovieOnNetflix(String movieName) {
        fan.on();
        fan.increase();
        livingRoomLight.on();
        tv.on();
        ((LivingRoomTV) tv).setSource("HDMI ARC");
        stick.on();
        soundBar.on();
        soundBar.setSoundMode("Dolby atmos");
        stick.openApp("Netflix");
        stick.selectContent(movieName);
        ((LivingRoomLight) livingRoomLight).dim();
        soundBar.volume(20);
        stick.play();
    }

    public void stopMovie() {
        stick.closing();
        stick.off();
        soundBar.off();
        tv.off();
        fan.off();
        ((LivingRoomLight) livingRoomLight).bright();
    }

    public void prepareFood(List<String> pizzaNames) {
        kitchenLight.on();
        refrigerator.partyMode();
        microwave.on();
        microwave.setOnPreHeat(200, 5);
        microwave.setGrillOn();
        electricGrill.on();
        coffeeMaker.on();
        pizzaNames.forEach(pizza -> microwave.bake(pizza, 400, 10));
    }

    public void closeKitchen() {
        refrigerator.normalMode();
        electricGrill.off();
        coffeeMaker.off();
        microwave.off();
    }
}
