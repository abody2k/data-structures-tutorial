package tutorial;


public class Tutorial {

	public static void main(String[] args) {

		Structure y = new Structure();

		StructureFunctions x = new Structure();
		x.doSomething();
		x.drawSomething();
		y.doSomething();
		y.drawSomething();
		y.eatSomething();
		/*
		 * I just figured out the difference between an implementation of interface and a class
		 * an interface can't be instantiated but we can make a instance of it if we have a class that implements it
		 * that's why the x can do all the functions of the Structurefunctions interface but can't do the eat which is
		 * a part of the Structure class itself
		 * while using the Structure class as the type of the variable y allowed it to call the Methods including the
		 * eat
		 */
	}

}