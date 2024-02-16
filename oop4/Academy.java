package oop4;

import java.util.ArrayList;

public class Academy {

	 public static void main(String[] args) {
	        ArrayList<Student> students = new ArrayList<>();
	        double[] arr = new double[students.size()];
	        
	        students.add(new Student("John Doe", 87, "Computer Science", "A.Smith"));
	        students.add(new Student("Jane Doe",98, "Computer Science", "A.Smith"));
	        students.add(new Student("Alice Johnson", 72, "Computer Science", "A.Smith"));
	        students.add(new Student("Bob Brown", 95, "Computer Science", "A.Smith"));
	        students.add(new Student("Charlie Green", 67, "Computer Science", "A.Smith"));
	        students.add(new Student("David White", 86, "Computer Science", "A.Smith"));
	        students.add(new Student("Eve Black", 73, "Computer Science", "A.Smith"));
	        students.add(new Student("Frank Red", 88, "Computer Science", "A.Smith"));
	        students.add(new Student("Grace Yellow", 98, "Computer Science", "A.Smith"));

	       
	        for (Student student : students) {
	            System.out.println(student.name + " " + student.avgRate + " " + student.group + " " + student.professor);
	            
	        }
	       
	    }
}

	