/*
 * Gustavo
 */
public class Service {
    
    //Variables
    double kmTraveled;
    int noServices;
    double kmPerService;

    public void setKmPerService(double kmPerService) {
        this.kmPerService = kmPerService;
    }

    public double getKmPerService() {
        return kmPerService;
    }

    //Setters
    
    public void setKmTraveled(double kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public void setNoServices(int noServices) {
        this.noServices = noServices;
    }

    //Getters
    
    public double getKmTraveled() {
        return kmTraveled;
    }

    public int getNoServices() {
        noServices = (int)Math.floor(kmTraveled / kmPerService);
        return noServices;
    }
    
    //Constructors
    public Service() {
         
        this.kmTraveled = 0;
        this.noServices = 0;
        this.kmPerService = 100;
        
    }

    public Service(double kmTraveled, int noServices, double kmPerService) {
        this.kmTraveled = kmTraveled;
        this.noServices = noServices;
        this.kmPerService = kmPerService;
    }
         
    
    
}
