package day23_Polymorphism;

public class Runner {

	public static void main(String[] args) {

//		A obj = new A("Jack", 15, 0, "Michigan");
//		B obj2 = new B();
//		System.out.println(obj);
//		System.out.println(obj2);
		
		A obj3 = new B (); // Upcasting
		
		// as an alternative option we can say
		
		Object obj = new A ("Arman", 38, 10, "Maryland"); // declaring the parent
		System.out.println(obj);
	
		Object obj2 = new B();
		System.out.println(obj2);
		
		Object [] objs = new Object [5];
		objs [0] = "test";
		objs [1] = 15;
		objs [2] = "c";
		objs [3] = 12.29;
		objs [4] = true;
		
		System.out.println(objs);
		
		System.out.println("---------------");
		
		Employee [] listOfEmp = new Employee [5];
		listOfEmp [0] = new Employee ("Ali1", 25, 2023409221);
		listOfEmp [1] = new Employee ("Ali2", 25, 2023409221);
		listOfEmp [2] = new Employee ("Ali3", 25, 2023409221);
		listOfEmp [3] = new Employee ("Ali4", 25, 2023409221);
		listOfEmp [4] = new Employee ("Ali5", 25, 2023409221);
		
		Student [] listOfStu = new Student [5];
		listOfStu [0] = new Student ("Hasan1", 35, 2023406598);
		listOfStu [1] = new Student ("Hasan2", 35, 2023406598);
		listOfStu [2] = new Student ("Hasan3", 35, 2023406598);
		listOfStu [3] = new Student ("Hasan4", 35, 2023406598);
		listOfStu [4] = new Student ("Hasan5", 35, 2023406598);
		
		Object [] listOfPeople = new Person [10]; // you can start as Person alternatively
		listOfPeople [0] = new Employee ("Ali1", 25, 2023409221);
		listOfPeople [5] = new Employee ("Ali2", 25, 2023409221);
		listOfPeople [6] = new Employee ("Ali3", 25, 2023409221);
		listOfPeople [7] = new Employee ("Ali4", 25, 2023409221);
		listOfPeople [8] = new Employee ("Ali5", 25, 2023409221);
		listOfPeople [9] = new Student ("Hasan1", 35, 2023406598);
		listOfPeople [1] = new Student ("Hasan2", 35, 2023406598);
		listOfPeople [2] = new Student ("Hasan3", 35, 2023406598);
		listOfPeople [3] = new Student ("Hasan4", 35, 2023406598);
		listOfPeople [4] = new Student ("Hasan5", 35, 2023406598);
	
		StringBuilder sb = new StringBuilder ("te");
		StringBuffer sb2 = new StringBuffer ("te");
		String s = new String ("te");

		System.out.println("test".contains(sb)); // charsequence is the parent
		System.out.println("test".contains(sb2)); // charsequence is the parent
		System.out.println("test".contains(s)); // charsequence is the parent

	}
	
	

}
