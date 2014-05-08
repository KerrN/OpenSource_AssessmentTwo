
public class FuelPurchase {
	private double	fuelEconomy;

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


/*By Jingxian And Connie*/
package org.jx.test;

public class FuelPurchase {
	private double costPerlitre;
	private double fuelLitres;

	public FuelPurchase(double fuelLitres, double costPerlitre) {
		this.costPerlitre = costPerlitre;
		this.fuelLitres = fuelLitres;
	}

	public double getTotalFuelCost() {
		return this.costPerlitre * fuelLitres;
	}

	public double getFuelEconomy() {
		return this.fuelLitres / 100;
	}

	public double getCostPerlitre() {
		return costPerlitre;
	}

	public void setCostPerlitre(double costPerlitre) {
		this.costPerlitre = costPerlitre;
	}

	public double getFuelLitres() {
		return fuelLitres;
	}

	public void setFuelLitres(double fuelLitres) {
		this.fuelLitres = fuelLitres;
	}

}
