package tutorial;

import java.util.List;
import java.util.ArrayList;

public class Tutorial {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("Cat");
		animals.add("Bird");
		animals.forEach(System.out::println);
//		animals.add("");
		// TODO Auto-generated method stub
		Structure x = new Structure();
		StructureFunctions.makeThings();
		System.out.println("Hello there");

	}

}