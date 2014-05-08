
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;

	private Journey			journey;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;

	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Make Year: " + makeYear);
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers());
		System.out.println("Total Services: " + journey.getTotalServices());
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
	}

}
/*By the group of Jingxian And Connie*/
package org.jx.test;

import org.jx.test.rental.PerDayRental;
import org.jx.test.rental.PerKmRental;
import org.jx.test.rental.Service;

public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;

	private Journey			journey; // kilometers and service

	private FuelPurchase	fuelPurchase; // total fuel cost and fuel economy
	private PerKmRental pkr;
	private PerDayRental pdr;
	private Service serviceRecord;
	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6, 1.4);
		pdr = new PerDayRental(300, 7);
		serviceRecord = new Service(journey.getTotalServices(), 300);
	}
	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6, 1.40);
		//pkr = new PerKmRental(300);
		pdr = new PerDayRental(300, 7);
		serviceRecord = new Service(journey.getTotalServices(), 300);
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 * @param serviceTimes
	 */
	public Vehicle(String manufacturer, String model, int makeYear, int serviceTimes){
			this.manufacturer = manufacturer;
			this.model = model;
			this.makeYear = makeYear;
			journey = new Journey();
			fuelPurchase = new FuelPurchase(125.6, 1.40);
			pdr = new PerDayRental(300, 7);
			serviceRecord = new Service(serviceTimes, 250);
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	private void printDetails(){
//		System.out.println("Manufacturer: " + manufacturer);
//		System.out.println("Model: " + model);
//		System.out.println("Make Year: " + makeYear);
		//System.out.println(toString());
		System.out.println(serviceRecord.getInfo(this, journey));
	}
	public void printJourney(Journey journey){
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers());
		System.out.println("Total Services: " + journey.getTotalServices());
	}

	public void printFuelPurchase(FuelPurchase fuelPurchase){
		System.out.println("Total fuel cost: " + String.format("%.2f", fuelPurchase.getTotalFuelCost()));
		System.out.println("Fuel economy: " + String.format("%.2f", fuelPurchase.getFuelEconomy()));
	}
	public void printService(Service service){
		System.out.println(service.getTravelKmLastService());
	}
	public void printPKRRevenue(PerKmRental pkr){
		System.out.println(pkr.getRevenue());
	}
	public void printPDRRevenue(PerDayRental pdr){
		System.out.println(pdr.getRevenue());
	}
	public void print() {
		printDetails();
		printJourney(journey);
		printFuelPurchase(fuelPurchase);
		printPDRRevenue(pdr);
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
	}

	public String getDetails(){
		StringBuilder str = new StringBuilder("Vehicle: " + this.manufacturer +" " + this.model + " (" +this.makeYear +" model)");
		return str.toString();
	}

}
