package day23_Polymorphism;

public class B extends A {

	@Override // if we dont override then it will print out the parametrized constructor from
				// Class A
	public String toString() {
		return "This is class B";
	}
}
