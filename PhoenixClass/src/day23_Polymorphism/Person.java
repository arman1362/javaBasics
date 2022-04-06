package day23_Polymorphism;

public class Person {

	private String name;
	private int age;
	private int phone;

	public Person() {
		this.name = "";
		this.age = 0;
		this.phone = 0;

	}

	public Person(String name, int age, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}
