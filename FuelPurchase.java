
public class FuelPurchase {
	private double	fuelEconomy;
        
        /*
         * New Class constructor
         * Sets fuelEconomy to 0
        */
        public FuelPurchase()
        {
            fuelEconomy = 0;
        }
        
	public FuelPurchase(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}

	public double getFuelEconomy() {
		return fuelEconomy;
	}

	public void setFuelEconomy(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}
}
