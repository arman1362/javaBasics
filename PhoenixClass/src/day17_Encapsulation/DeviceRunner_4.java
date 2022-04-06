package day17_Encapsulation;

import java.util.ArrayList;

public class DeviceRunner_4 {
	public static void main (String [] args ) {
	
	ArrayList<String> apps = new ArrayList<String> ();
	apps.add("Facebook");
	apps.add("Waze");
	apps.add("Google Maps");
	
	Device_3 obj1 = new Device_3 ("Arman Hussaini", "iPhone 13", 2019, "New", apps);
	apps.add("Messanger");
	
	Device_3 obj2 = new Device_3 ("Arman Hussaini", "iPhone 12", 2021, "New", new ArrayList<String> ());
	apps.add ("YouTube");
	apps.add("Whatsapp");
	
	Device_3 obj3 = new Device_3 ("Halimah Rafat", "iPhone 13", 2020, "New", new ArrayList<String> ());
	apps.add("Panorama");
	
	System.out.println(obj3);
	System.out.println(obj1);
	
	}

}
