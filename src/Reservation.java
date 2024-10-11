import java.time.LocalDate;

public class Reservation {
    private String idReservation;
    private User user;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

    public Reservation(String idReservation, Vehicle vehicle, LocalDate startDate, LocalDate endDate, double totalCost) {
        this.idReservation = idReservation;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
    }

    public void confirmBooking(){
        if(vehicle.isAvailability()){
            // Confirmar la reserva y actualizar el estado del vehículo como no disponible
            vehicle.setAvailability(false);

        }else{
            System.out.println("Vehicle is not available");
        }
        //marcar las fechas en el calendario como no disponibles
    }

    public void setUser(User user) {
        this.user = user; // Establece el usuario para la reserva
    }

    // Setters and Getters

    public String getIdReservation() {  
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

}
