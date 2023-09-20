package tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Tutorial {

	public static void main(String[] args) {

		List<String> alist = new ArrayList<>();
		alist.add("apple");
		alist.add("Banana");
		alist.add("Monkey");
		alist.forEach(System.out::println);
		for(Object x : alist) {
			
			System.out.println(x);
		}
		int i=3;
		for (Iterator<?> it = alist.iterator() ;it.hasNext();) {
			
System.out.println(it.next());
			it.remove();
			i--;
			if(!(it.hasNext())) {
				break;
			}
			
		}
	}

}