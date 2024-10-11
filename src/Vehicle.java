public class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private int year;
    private double dailyCost;
    private boolean availability;

    public Vehicle(String vehicleId, String brand, String model, int year, double dailyCost, boolean availability) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyCost = dailyCost;
        this.availability = availability;
    }
    
    public double calculatePrice(int dias, boolean seguro, boolean gps){

        if(seguro && gps) {
            return Double.valueOf((dailyCost + (dailyCost*0.10)) * (dias * 5));
        }
        else if(seguro){
            return Double.valueOf((dailyCost + (dailyCost*0.10)) * dias);
        }
        else if(gps){
            return Double.valueOf(dailyCost + (5 * dias));
        }
        else{
            return dailyCost * dias;
        }
    }

    // Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    /* public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("001", "Toyota", "Corolla", 2020, 50.0, true);

        System.out.println(vehicle.calculatePrice(10, false, false));
    } */
}
