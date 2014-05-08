
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int			makeYear;
	private Journey			journey;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;
        private Service service;
        private PerKmRental perKmRental;
        private PerDayRental perDayRental;
        private boolean isDayRental;

	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
                service = new Service();
                isDayRental = false;
                perKmRental = new PerKmRental();
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear, boolean isDayRental) {
		
                this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
                this.isDayRental = isDayRental;
                service = new Service();
                if (isDayRental){
                    perDayRental = new PerDayRental();
                }
                else{
                    perKmRental = new PerKmRental();}
               
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
        
        public void print()
        {
         System.out.println("Vehicle: " + manufacturer + " " + model + "(" + makeYear + " model)");
         
         if (service.getKmTraveled() <= 0){
             System.out.println("No travel has been recorded yet.");
         } else{
         System.out.printf("%.2f km travelled raising $%.2f%n",service.getKmTraveled(),getRevenue());
         }
         
         System.out.println("The vehicle has not yet been serviced");
         
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
        
        /**
         * Added Method, James
         *
         * Replaces the current Journey object
         * 
         * @param journey
         * 
         */
        public void newJourney(Journey journey)
        {
            this.journey = journey;
        }
        
        /*
         * New Method, James
         *
         * Replaces current FuelPurchase object
         * 
         * @param fuelPurchase
         *
        */
        public void newFuelPurchase(FuelPurchase fuelPurchase)
        {
            this.fuelPurchase = fuelPurchase;
        }
        
        private double getRevenue()
        {
        
            if (isDayRental)
            {
                return perDayRental.getTotalCost();
            }else
            {
                return perKmRental.getTotalCost();
            }
        }

}
