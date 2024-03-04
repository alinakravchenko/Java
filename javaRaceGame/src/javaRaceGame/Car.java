package javaRaceGame;

import java.util.ArrayList;
import java.util.List;

class Car {
    private int speed;
    private String model;
    private String color;
    private List<Upgrade> upgrades;

    public Car(int speed, String model, String color) {
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.upgrades = new ArrayList<>();
    }

    public int getSpeed() {
        int totalSpeed = speed;
        for (Upgrade upgrade : upgrades) {
            totalSpeed += upgrade.getSpeedIncrease();
        }
        return totalSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public List<Upgrade> getUpgrades() {
        return upgrades;
    }

    public void addUpgrade(Upgrade upgrade) {
        upgrades.add(upgrade);
    }
}