import java.time.LocalDateTime;
import java.util.List;

public class Appointment {
    private int id;
    private LocalDateTime dateTime;
    private Stylist stylist;
    private Customer customer;
    private List<Service> services;

    public Appointment(int id, LocalDateTime dateTime, Stylist stylist, Customer customer, List<Service> services) {
        this.id = id;
        this.dateTime = dateTime;
        this.stylist = stylist;
        this.customer = customer;
        this.services = services;
    }

   //get setter & getter for attributes

    public void addService(Service service) {
        services.add(service);
    }

    public void removeService(Service service) {
        services.remove(service);
    }

    public double calculateTotalCost() {
        //calculate cost
        double totalCost = 0.0;
        for (Service service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }

    //flesh out more options to appointment book
}
