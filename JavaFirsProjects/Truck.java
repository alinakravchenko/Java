package mainpackage;

public class Truck {
    private String brand;
    private String model;
    private String color;
    private double maxLoad;
    private double currentLoad;
    private boolean engineStarted;

    public Truck(String brand, String model, String color, double maxLoad, double currentLoad, boolean engineStarted) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.maxLoad = maxLoad;
        this.currentLoad = currentLoad;
        this.engineStarted = engineStarted;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
            System.out.println("Двигатель запущен.");
        } else {
            System.out.println("Двигатель уже запущен.");
        }
    }

    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
            System.out.println("Двигатель остановлен.");
        } else {
            System.out.println("Двигатель уже остановлен.");
        }
    }

    public void loadCargo(double cargoWeight) {
        if (currentLoad + cargoWeight <= maxLoad) {
            currentLoad += cargoWeight;
            System.out.println("Груз успешно загружен. Текущая загрузка: " + currentLoad);
        } else {
            System.out.println("Невозможно загрузить груз. Превышена максимальная грузоподъемность.");
        }
    }

    public void unloadCargo(double cargoWeight) {
        if (currentLoad - cargoWeight >= 0) {
            currentLoad -= cargoWeight;
            System.out.println("Груз успешно выгружен. Текущая загрузка: " + currentLoad);
        } else {
            System.out.println("Невозможно выгрузить груз. Недостаточно груза в грузовике.");
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "FM", "Red", 10000, 0, false);
        System.out.println("Текущая загрузка: " + truck.currentLoad);
        truck.startEngine();
        System.out.println("Двигатель статус: " + (truck.isEngineStarted() ? "Запущен" : "Остановлен"));
        truck.loadCargo(5000);
        truck.loadCargo(3000);
        truck.unloadCargo(2000);
        truck.stopEngine();
        System.out.println("Двигатель статус: " + (truck.isEngineStarted() ? "Запущен" : "Остановлен"));
    }
}
