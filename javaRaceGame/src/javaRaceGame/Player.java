package javaRaceGame;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String playerName;
    private int money;
    private List<Car> cars;
    private int selectedCarIndex;
    private Car selectedCar;


    public Player(String playerName) {
        this.playerName = playerName;
        this.money = 0;
        this.cars = new ArrayList<>();
        initializeCars(); 
        this.selectedCarIndex = 0;
        this.selectedCar = cars.get(selectedCarIndex);
    }
    public Car getCar(int index) {
        return cars.get(index);
    }

    public void setSelectedCarIndex(int index) {
        selectedCarIndex = index;
    }

    public int getSelectedCarIndex() {
        return selectedCarIndex;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public String getPlayerName() {
        return playerName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void getInfo() {
        System.out.println("Игрок: " + playerName);
        System.out.println("Деньги: " + money);
        System.out.println("Машины:");

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println("Машина " + (i + 1) + ": Скорость " + car.getSpeed());
        }
    }

    public void selectCar(int carIndex) {
        if (carIndex >= 1 && carIndex <= cars.size()) {
            this.selectedCarIndex = carIndex - 1;
            this.selectedCar = cars.get(selectedCarIndex);
            System.out.println("Выбрана машина " + carIndex + ". Скорость: " + selectedCar.getSpeed());
        } else {
            System.out.println("Некорректный выбор машины.");
        }
    }

    private void initializeCars() {
        //ошибка из-за одного параметра, хотя класс Car принимает три
    	 cars.add(new Car(50, "Model 1", "Red"));
         cars.add(new Car(60, "Model 2", "Blue"));
         cars.add(new Car(70, "Model 3", "Green"));
    }
}