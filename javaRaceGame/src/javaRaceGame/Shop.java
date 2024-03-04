package javaRaceGame;

import java.util.Scanner;

class Shop {
    public static void buyUpgrade(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступные обновления в магазине:");
        System.out.println("1. Турбонаддув (+20 к скорости, стоимость: 50 денег)");
        System.out.println("2. Улучшенный двигатель (+30 к скорости, стоимость: 70 денег)");
        System.out.println("3. Карбюратор с высокой производительностью (+40 к скорости, стоимость: 90 денег)");
        System.out.println("Выберите обновление (1-3) или введите 0 для выхода:");

        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 3) {
            Upgrade selectedUpgrade = createUpgrade(choice);
            if (player.getMoney() >= selectedUpgrade.getSpeedIncrease()) {
            	player.getCar(player.getSelectedCarIndex()).addUpgrade(selectedUpgrade);
                player.setMoney(player.getMoney() - selectedUpgrade.getSpeedIncrease());
                System.out.println("Обновление успешно установлено!");
            } else {
                System.out.println("У вас недостаточно денег для покупки этого обновления.");
            }
        } else if (choice != 0) {
            System.out.println("Некорректный выбор. Пожалуйста, выберите еще раз.");
        }
    }

    private static Upgrade createUpgrade(int choice) {
        switch (choice) {
            case 1:
                return new Upgrade("Турбонаддув", 50);
            case 2:
                return new Upgrade("Улучшенный двигатель", 70);
            case 3:
                return new Upgrade("Карбюратор с высокой производительностью", 90);
            default:
                throw new IllegalArgumentException("Некорректный выбор обновления.");
        }
    }
}