package day28_30_AbstractionExamples;

public interface Person {

	public void printInfo ();

	}

// abstraction will give you a list of methods that you must develop

// abstraction can be done in two ways;
// 1- using abstract keyword - abstract class
// 2- using interfaces

// class student agreed to have the printInfo method
// one class can extend only one parent (Inheritance) but can implement multiple interfaces (Abstraction)

// Person someone = new Student () person is the object - upcasting is possible with interfaces
// person someone = new person () you can't initialize an interface with abstraction

// you cant create an object of the interface