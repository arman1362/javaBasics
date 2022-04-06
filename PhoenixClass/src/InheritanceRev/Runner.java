package InheritanceRev;

public class Runner {

	public static void main(String[] args) {
		
		C objC = new C ();
		objC.getNum ();
		
		A objA = new A () ;
		objA.getNum ();
		
		System.out.println(objA);
		System.out.println(objC);
	}

}
