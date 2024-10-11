import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class User {
    private String idUser;
    private String name;
    private Reservation Reservation;

    public User(String idUser, String name) {
        this.idUser = idUser;
        this.name = name;
    }

    public void bookVehicle(Vehicle vehicle, LocalDate startDate, LocalDate endDate, boolean seguro, boolean gps) {

        int days = (int) ChronoUnit.DAYS.between(startDate, endDate);

        double totalCost = vehicle.calculatePrice(days, seguro, gps); // Calcular el costo total de la reserva

        //System.out.println("from bookVehicle: "+totalCost); // Imprimir el costo total de la reserva
        
        Reservation reservation = new Reservation("1A", vehicle, startDate, endDate, totalCost);

        // Añadir la reserva al usuario y establecer la relación bidireccional
        this.Reservation = reservation;
        reservation.setVehicle(vehicle);
        reservation.setUser(this);

    }

    public String getName() {
        return name;
    }

    public String getIdUser(){
        return idUser;
    }

    public Reservation getReservations() {
        return Reservation;
    }

    /* public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("v2", "tesla", "model s", 2024, 100, true);

        User user = new User("1", "Juan Pérez");

        LocalDate pickupDate = LocalDate.of(2023, 1, 15);
        LocalDate returnDate = LocalDate.of(2023, 1, 20);

        //System.out.println(pickupDate);
        //System.out.println(returnDate);

        long days = (int) ChronoUnit.DAYS.between(pickupDate, returnDate);

        int daysInt = (int) days; // Convertir el resultado a int

        System.out.println(days + 5);

        //user.bookVehicle(vehicle1, pickupDate, returnDate, false, false);
    } */
}

