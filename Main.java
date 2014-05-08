import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014);

		v.printDetails();
		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
		}
		
		System.out.println("\n\n");
		
		v.printDetails();
	}

}
// By Jingxian and Connie
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014);
		Vehicle d = new Vehicle("honda", "3434", 2011);

		v.printDetails();

		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
		}

		System.out.println("\n\n");

		v.printDetails();
	}

}

/*By the group of Jingxian And Connie*/
package org.jx;
import java.util.*;

import org.jx.test.Vehicle;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014);
		//Vehicle v = new Vehicle("Ford", "T812", 2014, 3);
		v.print();
		System.out.println("-------------after extended--------------");
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
		}

		System.out.println("\n\n");

		v.print();
	}

}
