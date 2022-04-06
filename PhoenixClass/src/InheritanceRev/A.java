package InheritanceRev;

public class A {

	private int num;

	public A() {
		num = 0;
	}

	public A(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString () {
		return "num: " + num;
	}
}
