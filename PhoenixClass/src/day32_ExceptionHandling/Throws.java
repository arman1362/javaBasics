package day32_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	public static void main(String[] args) {
		
		doSomething ();
		
	}
		public static void doSomething () {
			try {
				FileInputStream f1= new FileInputStream (new File (""));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
