package LabSession11182021;

public class Counter {

	static int count = 0; // the result for static is 6 while for non static is 1

	public Counter() {
		count++;
		System.out.println(count);

	}

	@Override
	public String toString() {
		return "Counter [count=" + count + "]";
	}
	

}
