package day25_OOPExampleCartWithMethods;

public class Customer {

	private String firstName;
	private String lastName;
	private int age;
	private int phoneNum;
	private String user;
	private String pass;
	private Cart cart;

	static int count = 0; // this will increase the count of customers

	public Customer() {
		super();
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.phoneNum = 0;
		this.cart = new Cart();
		this.user = "";
		this.pass = "";
		count++;
	}

	public Customer(String firstName, String lastName, int age, int phoneNum) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Customer.count = count;
	}

	public Cart getCart() {
		return cart;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNum=" + phoneNum
				+ "]";
	}
}
