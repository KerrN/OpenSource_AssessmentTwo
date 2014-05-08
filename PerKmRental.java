/*
* Per Kilometer Rental
* 
* James
*/
public class PerKmRental {
    
    // Variables
    
    double kmTraveled; // Kilometers Traveled
    double costPerKm; // Cost in dollars per kilometer
    
    
    /*
     * Default Class Costructor
     */
    
    public PerKmRental()
    {
        kmTraveled = 0;
        costPerKm = 1; //Assume default cost $1 per km
    }
    
    /*
     * Class Constructor specifying Kilometers traveled and Cost per Kilometer
    */
    
    public PerKmRental(double kmTraveled, double costPerKm)
    {
        this.kmTraveled = kmTraveled;
        this.costPerKm = costPerKm;
    }
    
    /*
    * Get Methods
    */
    public double getKmTraveled()
    {
        return kmTraveled;
    }
    
    public double getCostPerKm()
    {
        return costPerKm;
    }
    
    /*
     * Set Methods
     */
    
    public void setKmTraveled(double kmTraveled)
    {
        this.kmTraveled = kmTraveled;
    }
    
    public void setCostPerKm(double costPerKm)
    {
        this.costPerKm = costPerKm;
    }
    
    /*
     * Gives total cost of km traveled
     */
    
    public double getTotalCost()
    {
        return (costPerKm * kmTraveled);
    }
    
    /*
     * Add Kilometes
     * Adds specified amount of kilometers
     */
    
    public void addKm(double kmAdded)
    {
        kmTraveled += kmAdded;
    }
    
}
