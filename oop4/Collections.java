package oop4;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        //System.out.println("Missing!!!");
        for(String name:names) {
        	System.out.println(name);
        }
        
        String el = names.get(0); 
		System.out.println("Первый в списке: " + el);
		
		names.set(0, "Name1 отсутствует по уважительной причине");
		System.out.println("Первый в списке: " + names.get(0));
		
		names.remove(2);
		for(String name:names) {
			System.out.println(name);
		}
        
        
	}

}
