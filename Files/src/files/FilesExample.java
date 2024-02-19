package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesExample {

	public static void main(String[] args) {
		
		/* try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("no files");
	            e.printStackTrace();
	        }

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
	            writer.write("1\n");
	            writer.write("2\n");
	            writer.write("3\n");
	            writer.write("4\n");
	            writer.write("5\n");
	            writer.write("6\n");
	            writer.write("7\n");
	        } catch (IOException e) {
	            System.out.println("fatal error");
	            e.printStackTrace();
	        }

	        calculateSum();
	    }

	    private static void calculateSum() {
	        File file = new File("output.txt");
	        Scanner scanner = null;
	        int sum = 0;

	        try {
	            scanner = new Scanner(file);
	            while (scanner.hasNextInt()) {
	                sum += scanner.nextInt();
	            }
	            System.out.println("The sum of the numbers in output.txt is: " + sum);
	        } catch (Exception e) {
	            System.out.println("Error reading output.txt: " + e.getMessage());
	        } */
		/*File source = new File("file.txt");
		File destination = new File("output.txt");
	    try(FileInputStream fis = new FileInputStream(source);
	    	FileOutputStream fos = new FileOutputStream(destination)){
	    	byte[] buffer = new byte[1024];
	    	int lenght;
	    	while((lenght = fis.read(buffer))>0) {
	    		fos.write(buffer, 0, lenght);
	    	}
	    	System.out.println("Copy File");
	    }catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            
        } */
		
		/*try {
			File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            int wordCount = 0;
            while(scanner.hasNext()) {
            	scanner.next();
                wordCount++;
            }
            System.out.println("Word Count in file.txt: " + wordCount);
           
        } catch (Exception e) {
            System.out.println("Error reading file.txt: " + e.getMessage());
         } */
		
		try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println("line length in file.txt: " + line.length());
			}      
        } catch (Exception e) {
            System.out.println("Error reading file.txt: " + e.getMessage());
         } 
	    }
	}
