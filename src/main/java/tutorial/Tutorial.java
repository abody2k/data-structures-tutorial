package tutorial;


import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class Tutorial {

	public static void main(String[] args) {

		Queue<Integer> a = new PriorityQueue<>();
		Queue<Double> b = new LinkedList<>();
		a.addAll(Arrays.asList(3,1,2,4,66,-200));
		b.addAll(Arrays.asList(1.0,2.0,3.0,4.0,4.4,-2.00));
		a.forEach(System.out::println);
		b.forEach(System.out::println);
		
		for(Iterator<?> it = a.iterator();it.hasNext();) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Just finished sleeping");
			it.next();

			it.remove();
		}

	
		

	}

}