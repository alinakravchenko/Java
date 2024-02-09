package mainpackage;

import java.util.Scanner;

class Car{
	private String name;
	private String manufacturer;
	private int year;
	private double engine_capacity;
	
	public Car() {
	    }
	public Car(String name, String manufacturer, int year, double engine_capacity) {
	        this.name = name;
	        this.manufacturer = manufacturer;
	        this.year = year;
	        this.engine_capacity = engine_capacity;
	}
	 public void setName(String name) {
	        this.name = name;
	    }

	    public void setmanufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public void setengine_capacity(double engine_capacity) {
	        this.engine_capacity =  engine_capacity;
	    }
	    public void inputCar(String name, String manufacturer, int year, double engine_capacity) {
	    	this.name = name;
	        this.manufacturer = manufacturer;
	        this.year = year;
	        this.engine_capacity = engine_capacity;
	    }

	    public void outputCar() {
	        System.out.println("Название: " + name);
	        System.out.println("Название производителя: " + manufacturer);
	        System.out.println("Год выпуска: " + year);
	        System.out.println("Объем двигателя: " + engine_capacity + " литров");
	        
	    }
}
public class car {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
        
                                     /*Задание 6. Реализовать класс Автомобиль*/
    Car car1 = new Car();
    car1.inputCar("Ford Mustang", "Ford", 2023, 5.0);
    car1.outputCar();

    System.out.println();

    Car car2 = new Car("Volkswagen Golf", "Volkswagen", 2020, 1.4);
    car2.outputCar();

	}

}
