/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 041401076
 */
public class PerDayRental {
    
    
    /*
     * Variables
     * 
     * CostPerDay - Cost in Dollars per day to rent
     * KmTraveled - Total Kilometers traveled by car
     * TotalDays - Total days the car has been rented for 
     */
    
    private double costPerDay;
    private double kmTraveled;
    private int totalDays;
    
     /*
      * Default Constructor
      */
    
    public PerDayRental()
    {
        costPerDay = 100; //Default Value given in description
        kmTraveled = 0;
        totalDays = 0;
    }
    
    /*
     * Construtor specifying data
     */
    public PerDayRental(double costPerDay, double kmTraveld, int totalDays)
    {
        this.costPerDay = costPerDay;
        this.kmTraveled = kmTraveld;
        this.totalDays = totalDays;
    }
    
    /*
     * Get Methods
     */

    public double getCostPerDay()
    {
        return costPerDay;
    }
    
    public double getKmTraveled() 
    {
        return kmTraveled;
    }

    public int getTotalDays() 
    {
        return totalDays;
    }
    
    /*
     * Set Methods
     */
    public void setCostPerDay(double costPerDay) 
    {
        this.costPerDay = costPerDay;
    }

    public void setKmTraveled(double kmTraveled) 
    {
        this.kmTraveled = kmTraveled;
    }

    public void setTotalDays(int totalDays) 
    {
        this.totalDays = totalDays;
    }
    
    /*
     * Calaculate the total cost
     */
    
    public double getTotalCost()
    {
        return (totalDays * costPerDay);
    }
    
    public String getCostSts()
    {
        String str = "" + (totalDays * costPerDay);
        return str;
    }
    
    /*
     * Add Days
     * 
     * Default Adds one day
     * Overloaded specifies input
     */
    
    public void addDay()
    {
        totalDays += 1;
    }
    
    public void addDay(double daysAdded)
    {
        totalDays += daysAdded;
    }
    
    /*
     * Add Kilomets
     * Adds specified amount of kilomters
     */
    
    public void addKm(double kmAdded)
    {
        kmTraveled += kmAdded;
    }
}

