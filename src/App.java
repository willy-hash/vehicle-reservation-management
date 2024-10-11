import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Administrator administrator = new Administrator("a1", "admin1");

        Vehicle vehicle1 = new Vehicle("v2", "tesla", "model s", 2024, 100, true);
        Vehicle vehicle2 = new Vehicle("v3", "honda", "civic", 2020, 100, true);

        administrator.addVehicle(vehicle1);
        administrator.addVehicle(vehicle2);

        User user1 = new User("u1", "william");

        LocalDate pickupDate = LocalDate.of(2023, 1, 15);
        LocalDate returnDate = LocalDate.of(2023, 1, 25);

        user1.bookVehicle(vehicle1, pickupDate, returnDate, true, false);

        user1.getReservations().confirmBooking();


        System.out.println(user1.getReservations().getTotalCost());
        
    }
}
