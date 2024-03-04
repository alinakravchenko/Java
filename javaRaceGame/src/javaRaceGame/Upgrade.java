package javaRaceGame;

class Upgrade {
    private String name;
    private int speedIncrease;

    public Upgrade(String name, int speedIncrease) {
        this.name = name;
        this.speedIncrease = speedIncrease;
    }

    public int getSpeedIncrease() {
        return speedIncrease;
    }
}
