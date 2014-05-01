//Ryan Arrowsmith - I have added a member variable called fuelType and have added it to the default Class constructor as well as the custom Class constructor.
//Mitchell Panicciari - Added New Vehicle Called 'c' and printed details
//Schyler Kuosmanen - Added 500kilometers to vehicle 'c'

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014, "Unleaded");
                Vehicle c = new Vehicle("Nissan", "Navara", 2013, "Diesel");

		v.printDetails();
                c.printDetails():
                
                c.addKilometers(500);
		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
		}
		
		System.out.println("\n\n");
		
		v.printDetails();
	}

}
