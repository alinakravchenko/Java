package mainpackage;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class lesson2 {

	public static void main(String[] args) {
		int [] myarr = new int [15];  //создание массива
		Random rand = new Random();
		for(int i = 0;i<myarr.length;i++) {
			myarr[i]=rand.nextInt(20)-5;
		}                             //инициализация случайными значениями
		
		int max = myarr[0];
		int firstMaxIndex = 0;
		/*for(int i = 0;i<myarr.length;i++) {
			if(myarr[i]>max)
			{
				max = myarr[i];
			}
		} */    
		
		/*for(int i = 0;i<myarr.length;i++) {
			if(myarr[i]==max) {
				firstMaxIndex = i;
				break;
			}
		}                        //нашли индекс первого максимального элемента
		
		int newLength = myarr.length-firstMaxIndex;
		int[] newArr = new int[newLength];
		for(int i = firstMaxIndex, j=0 ;i<myarr.length;i++, j++) {
			newArr[j] = myarr[i];
		}
		Arrays.sort(myarr);
		for(int el:myarr) {
			System.out.println(el);
		}
		for(int el:myarr) {
			System.out.println(el);
		}
		System.out.println("----------------------");
		for(int el:newArr) {
			System.out.println(el);
		}*/
		
		/*int[][] d2Arr = new int [3][3];
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        d2Arr[i][j] = new Random().nextInt(100);
		        
		        System.out.print(d2Arr[i][j] + " ");
		    }
		    System.out.println();
		}
		// Сортируем каждую строку массива
		 for (int i = 0; i < 3; i++) {
	            Arrays.sort(d2Arr[i]);
	        }
        
        System.out.println("Массив после сортировки:");
        // Выводим отсортированный массив на экран
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(d2Arr[i][j] + " ");
            }
            System.out.println();
        }*/
		
		
	   
    }


}
/*length — возвращает количество символов в строке.

■ isEmpty — возвращает истину, если строка не содержит
символов, иначе ложь. Работает быстрее чем length.

■ charAt — возвращает символ из строки по индексу.

■ contains — возвращает истину, если строка содержит
хотя бы одно совпадение с сравниваемой строкой. 

startsWith — возвращает истину, если строка начинается с искомого символа или строки.

trim — возвращает строку с удаленными начальными
и конечными пробелами.

toLowerCase  — возвращает строку в  которой все
заглавные символы исходной строки заменены на
строчные

toUpperCase — возвращает строку в которой все строчные символы 
исходной строки заменены на заглавные.

■ indexOf — возвращает индекс символа, с  которого
найдено первое совпадение с искомой строкой или
символом. Поиск начинается с  начала сроки. Если
совпадение не найдено возвращает –1; 
lastIndexOf — возвращает индекс символа, с которого
		найдено первое совпадение с искомой строкой или символом. Поиск начинается с 
		конца сроки. Если совпадение не найдено возвращает -1
		
		■ substring — возвращает часть строки из исходной.
		
		■ replace — возвращает строку, заменяя в исходной строке символ или набор символов на другой символ или
		набор символов.
		
		■ getBytes — возвращает строку в виде массива байт.
		
		■ getChars — извлекает символы строки в массив символов;
		
		■ split — поиск вхождения в строку заданного регулярного выражения 
		(разделителя) и деление исходной cтроки в соответствии с этим на массив строк.*/

