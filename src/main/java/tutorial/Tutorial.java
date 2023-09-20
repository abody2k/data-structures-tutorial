package tutorial;


import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 * Implementing all the types of Sets
 * While hash set is the best it lacks order, Tree set order elements based on their value
 * finally LinkedHashSet uses a linked list which sorts the elements on their addition to the list order
 * 
 */
public class Tutorial {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Set<String>linkedHashSet= new LinkedHashSet<>();
		
		hashSet.add("b");
		hashSet.add("a");
		hashSet.add("c");
		
		treeSet.add("b");
		treeSet.add("d");
		treeSet.add("k");
		
		linkedHashSet.add("s");
		linkedHashSet.add("z");
		linkedHashSet.add("c");
		
		hashSet.retainAll(linkedHashSet);
		treeSet.addAll(linkedHashSet);
		linkedHashSet.removeAll(treeSet);
		
		hashSet.forEach(System.out::println);
		treeSet.forEach(System.out::println);
		linkedHashSet.forEach(System.out::println);

	}

}