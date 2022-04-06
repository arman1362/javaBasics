package javaBasics;

public class Updated_OOP_Principles {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}

		/*
		1- 	PolyMorphism: The ability of an object to take many forms. To put it simply, 
			polymorphism in Java allows us to perform the same action in many different ways.
		 
			Two different types of Polymorphism: 
			1- 	Static polymorphism = overloading which happense during the compile time 
				same methods in the same class with different signatures like human roles; one person 
				being a father, bother, son, teacher
		 	2- 	Dynamic polymorphism = overrriding which happense during run time
		 		When methods with the same name and arguments are present in child and parents' class
		 		and class inheriting the method from its superclass (parent class) has the option to 
		 		override it. The benefit of overriding is the ability to define behavior specific to 
		 		a particular class. Method Overriding is possible only by inheritance. look below
		 		
		 		We can override the member functions but not the data members.

				Upcasting is declaing an object of the parent class and initializing any of the child classes.

		2- 	Abstraction: mean hiding. Abstraction is epresenting the essential features without 
			concerning about the background details. In Java, abstraction is implemented by:
		 	1- abstract class (partial abstraction)
		 	2- interfaces (100% abstraction)

		 	- A class can implement multiple interfaces (Abstraction)
		 	- An abstract class can only extend from one class
		 	- You cant create an object of the interface
		 	- An abstract method is a method that is declared without implementation.
			- There can be no object of an abstract class or interface. That is, an abstract 
			  class can not be directly instantiated with the new operator.
			- An abstract class can have parameterized constructors and the default constructor 
			  is always present in an abstract class.
		 	- In any abstract class, you can have zero or many abstract methods
		 	- Interface methods do not have a body - the body is provided by the "implement" class
		 	- You can have both abstract and non abstract code in abstract classes
			Code readability

		3-  Encapsulation: helps with data security, allowing you to protect the data stored in 
			a class from system-wide access. Encapsulation safeguards the internal contents of 
			a class like a capsule. You can implement encapsulation in Java by making the class 
			variables private and accessing them via their public getter and setter methods.
			Encapsulation is data hiding(information hiding) while Abstraction is detailed hiding(implementation hiding).
			Code security
			
		4- 	Inheritance: is a concept that inherit the properties from one class to other classes; for example, the relationship between father and son. 
			In Java, a class can inherit attributes and methods from another class. 
			Code reusability
			
			You cant have static class but you can have inner(nested) static class.
			
			Static method restrictions:
			1- The static method can not use non-static data member or call the non-static method directly.
			2- This and super cannot be used in static context as they are non-static.

			The static data members and methods belong to the class.
			You cant use the keyword this with static variables because keyword "this"
			refers to the stack while the static variables are stored in static memory in
			heap.
		
			I >>> C is implement
			C >>> C is extend
			C >>> I is not possible
			I >>> I is extend
			AC >> C is extend
	*/
	}
	class Animal {
		public void eat() {
			System.out.println("Eat all eatables");
		}
	}

	class Dog extends Animal {
		// eat() method overridden by Dog class.
		public void eat() {
			System.out.println("Dog likes eating bones");
		}
	}


