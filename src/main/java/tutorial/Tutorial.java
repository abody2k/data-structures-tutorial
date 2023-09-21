package tutorial;


import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Tutorial {

	public static void main(String[] args) {

		List<String> a = new ArrayList<>();
		List<String> b= new LinkedList<>();
		a.add("hola");
		a.add("world");
		b.add("hola");
		b.add("world");
		a.add(0,"inserted");
		a.add(0, "inserted at 0");
		Collections.shuffle(a);
		System.out.println(a.stream().collect(Collectors.counting()));
		Collections.sort(a);
		Collections.rotate(a, 5);
		Collections.reverse(a);
		
		a.forEach(System.out::println);
		
		for(ListIterator<?> it = a.listIterator(0);it.hasNext();) {
			System.out.println(it.previousIndex()+1);
			it.next();
			
		}
		

	}

}