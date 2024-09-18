import javax.swing.text.rtf.RTFAttributes;
import java.util.Date;

public class Hotel {
    public static void main(String[] args) {
        // Create a room
        Room room = new Room("123", new Date(), boolean isAvailable , new Date(), new Date());


        // Create a passenger
        Guest guest = new Guest("Ka Ying", "010222011234", "kychan@gmail.com", "01110951809");

        // Create a reservation for the passenger on seat1 of the room
        Reservation reservation = guest.createReservation(room);

        // Display reservation details
        System.out.println("Reservation Number: " + reservation.getReservationNumber());
        System.out.println("Guest Name: " + reservation.getGuest().getName());
        System.out.println("Room Number: " + reservation.getRoom().getroomNumber());
        System.out.println("Check in Date: " + reservation.getRoom().getCheckinDate());

        System.out.println("Check out Date: " + reservation.getRoom().getCheckoutDate());
        System.out.println("Available: " + reservation.getRoom().getAvailable());
//        System.out.println("Arrival Time: " + reservation.getRoom().getArrivalTime());
        System.out.println("Reservation Date: " + reservation.getReservationDate());
    }
}