package day28_30_AbstractionExamples;

public interface SampleInterface {

	// Interface vs abstract class
	// interface is used for 100% abstraction
	// you can implement as many interfaces as you want
	// an abstract class can only extend from one class

	// abstract classes are still classes and you can extend only one class- does
	// not matter if it is abstract or not
	// in any abstract class, you can have zero or many abstract methods

	// you can not create objects of either abstract class or interfaces

	// the only cases that you have implementation for a method in an interface is:
	// 1- static methods
	// 2- default methods
	
	// I >>> C is implement
	// C >>> C is extend
	// C >>> I is not possible
	// I >>> I is extend
	// AC >> C is extend
	
	// class vs abstract class
	// You can have both abstract and non abstract code in abstract classes
	// you can have both abstract and non abstract code in abstract classes
	// the downside of abstract class is that you cant have objects of abstract classes

	// 
	public static void someMethod() { // case 1
		System.out.println("someMethod");
		
	}

	public default void doSomethingElse () { // the class inherit one piece
		System.out.println("default implementation of that dosomethingelse method");
	}
}
