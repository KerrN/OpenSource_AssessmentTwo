import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014);
                Vehicle x = new Vehicle("Dmc","Delorian", 1980); //added new car
		v.printDetails();
		x.printDetails();
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
                        x.addKilometers(new Random().nextInt(100)); //added new int
		}
		
		System.out.println("\n\n");
		
		v.printDetails();
                x.printDetails(); //and new print
	} 

}
