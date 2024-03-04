package javaRaceGame;

import java.util.Scanner;

class Race {
    public static void startRace(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nГонка началась!");
        int playerHealth = 100;
        int playerMoney = 50;
        int playerDamage = 10;

        int enemyHealth = 100;
        int enemyMoney = 50;
        int enemyDamage = 10;

        while (playerHealth > 0 && enemyHealth > 0) {
            int playerMove = getRandomMove();
            int enemyMove = getRandomMove();

            if (playerMove == enemyMove) {
                System.out.println("Ничья!");
                playerHealth -= enemyDamage;
                enemyHealth -= playerDamage;
            } else if ((playerMove == 0 && enemyMove == 2) || (playerMove == 1 && enemyMove == 0) || (playerMove == 2 && enemyMove == 1)) {
                System.out.println("Вы победили и пришли первым к финишу!");
                playerMoney += enemyMoney;
                break;
            } else {
                System.out.println("Вы проиграли. Гонка окончена.");
                break;
            }
        }

        if (playerHealth <= 0) {
            System.out.println("Ваш автомобиль поврежден, и вы не смогли закончить гонку.");
        }

        player.setMoney(playerMoney);

        System.out.println("Вы заработали " + playerMoney + " денег.");
    }

    private static int getRandomMove() {
        return new java.util.Random().nextInt(3);
    }

    public static void main(String[] args) {
        // create a new player
        Player player = new Player("John Doe");

        // add some cars to the player's collection
        player.addCar(new Car(50, "Model 1", "Red"));
        player.addCar(new Car(60, "Model 2", "Blue"));
        player.addCar(new Car(70, "Model 3", "Green"));

        // select the first car
        player.selectCar(1);

        // start the race
        startRace(player);
    }
}