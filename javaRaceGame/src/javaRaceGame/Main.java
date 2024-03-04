package javaRaceGame;

public class Main {

    public static void main(String[] args) {
        // Create a new player with the name "John Doe"
        Player player = new Player("John Doe");

        // Add some cars to the player's collection
        player.addCar(new Car(50, "Model 1", "Red"));
        player.addCar(new Car(60, "Model 2", "Blue"));
        player.addCar(new Car(70, "Model 3", "Green"));

        // Select the first car
        player.selectCar(1);

        // Print the player's information
        player.getInfo();

        // Go to the shop and buy an upgrade
        Shop.buyUpgrade(player);

        // Start a race
        Race.startRace(player);
    }

}