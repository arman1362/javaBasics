package day23_Polymorphism;

public class A extends Object { // Object is a class

	private String name;
	private int age;
	private double balance;
	private String address;

	// Constructor helps creating an object of a class and initializeing all the
	// variables of a class

	// default constructor
	public A() {
		super();
		this.name = "";
		this.age = 0;
		this.balance = 0;
		this.address = "";
	}

	// parametrized constructor 1

	public A(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		this.balance = 0;
		this.address = "";

	}
	// Parametrized constructor 2

	public A(String name, int age, double balance, String address) {
		this(name, age); // getting from parametrized constructor 1
		this.balance = balance; // initializing for parametrized constructor 2
		this.address = address; // initializing for parametrized constructor 2
	}

	// method overloading is a type of static polymorphism that happense during
	// compile time
	// overloading is the idea of having different versions of the same method in
	// the same class
	// you would have to have different signatures if you want to have different
	// versions of the same method

	// Overriding is dynamic polymorphism that happense during runtime
	// Overriding is the idea of re-defining a method that we inherit in the current class
	// the tag @override will be added to ensure that you are actually matching the
	// definition of a mthod that you inherit.
	// doing so we are making sure that we are actually overriding something and not
	// making a new method

	// Upcatsing is the idea of declaring the parent class object and initializing
	// the classes of the child classes

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "A [Name= " + name + ", Age= " + age + ", Balance= " + balance + ", Address= " + address + "]";
	}
}
