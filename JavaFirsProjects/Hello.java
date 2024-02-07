package mainpackage;

import java.util.Scanner;

public class Hello {


	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); 
		 /*System.out.print("Введите ваше имя: ");
	        String name = scanner.nextLine();

	        System.out.print("Введите ваш возраст: ");
	        int age = scanner.nextInt();

	        if (age >= 18) {
	            System.out.println(name + " вы совершеннолетний");
	        } else {
	            System.out.println(name + " вы не совершеннолетний");
	        }*/
	
		                                  /* Задание 1. Вывести на разных строках надпись */
		  //System.out.println("Your time is limited,\n  so don’t waste it\n      living someone else’s life\n \tSteve Jobs");
		 
		                                  /* Задание 2. Процент от числа */
		    /*System.out.print("Введите число: ");
	        double number = scanner.nextDouble();
	        
	        System.out.print("Введите процент: ");
	        double percent = scanner.nextDouble();
	        
	        double result = (percent / 100) * number;
	        
	        System.out.println("Результат: " + result);*/
		  
		                                  /* Задание 3. Сложить цифры, которые ввёл пользователь */        
		    /*System.out.print("Введите первую цифру: ");
	        int number1 = scanner.nextInt();
	        System.out.print("Введите вторую цифру: ");
	        int number2 = scanner.nextInt();
	        System.out.print("Введите третью цифру: ");
	        int number3 = scanner.nextInt();
	        
	        System.out.println("Сформированное число: " + number1 + number2 + number3);*/
		  
		                                  /* Задание 4. Подмена цифр */
		 
		    /*System.out.println("Введите шестизначное число:");
	        int number = scanner.nextInt();

	        if (number >= 100000 && number <= 999999) {
	            int firstDigit = number / 100000;
	            int secondDigit = number % 100000 / 10000;
	            int thirdDigit = number % 10000 / 1000;
	            int fourthDigit = number % 1000 / 100;
	            int fifthDigit = number % 100 / 10;
	            int sixthDigit = number % 10;
	            System.out.println("Полученное число: " + (sixthDigit * 100000 + fifthDigit * 10000 + thirdDigit * 1000
	                    + fourthDigit * 100 + secondDigit * 10 + firstDigit));
	        } else {
	            System.out.println("Ошибка! Введено не шестизначное число");
	        }*/
		 
		                                  /* Задание 5. Определние сезона года по цифрам, которые ввёл пользователь */
		/* System.out.println("Введите номер месяца: ");
		 int month = scanner.nextInt();
		 if(month>= 1 && month<=12) {
			 if (month == 1 || month == 2 || month == 12) {
	                System.out.println("winter");
	            } else if (month >= 3 && month <= 5) {
	                System.out.println("spring");
	            } else if (month >= 6 && month <= 8) {
	                System.out.println("summer");
	            } else {
	                System.out.println("autumn");
	            }
	        } else {
	            System.out.println("Ошибка: введено неверное значение месяца.");
	        }*/
		 
		                                  /*Задание 6. Из метров в мили, дюймы, ядры*/
		    System.out.print("Введите метры: ");
	        double meters = scanner.nextDouble();
	        
	        System.out.println("Выберите единицу измерения для перевода:");
	        System.out.println("1. Мили\n2. Дюймы\n3. Ярды");
	        
	        int choice = scanner.nextInt();
	        double result = 0;
	        
	        switch (choice) {
	            case 1:
	                result = meters * 0.000621371;
	                System.out.println(meters + " метров = " + result + " миль");
	                break;
	            case 2:
	                result = meters * 39.3701;
	                System.out.println(meters + " метров = " + result + " дюймов");
	                break;
	            case 3:
	                result = meters * 1.09361;
	                System.out.println(meters + " метров = " + result + " ярдов");
	                break;
	            default:
	                System.out.println("Некорректный выбор");
	                break;
	        }
	}
}
