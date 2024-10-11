import java.util.ArrayList;

public class Administrator {
    private String idAdministrator;
    private String name;
    private ArrayList<Vehicle> fleet;

    public Administrator(String idAdministrator, String name) {
        this.idAdministrator = idAdministrator;
        this.name = name;
        this.fleet = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void checkAvailability(String idVehicleId){
        for(Vehicle vehicle : fleet) {
            if(vehicle.getVehicleId().equals(idVehicleId)) {
                System.out.println(vehicle.isAvailability());
            }
        }
    }

    public void displayVehiclesAvailable(){
        for(Vehicle vehicle : fleet) {
            if(vehicle.isAvailability()){
                System.out.println(vehicle.getVehicleId());
                System.out.println(vehicle.getBrand());
                System.out.println(vehicle.getModel());
                System.out.println(vehicle.getYear());
                System.out.println(vehicle.getDailyCost());
                System.out.println(vehicle.isAvailability());
            }

        }
    }

    public ArrayList<Vehicle> getFleet(){
        return fleet;
    }

    public String getIdAdministrator() {
        return idAdministrator;
    }

    public String getName() {
        return name;
    }

}
