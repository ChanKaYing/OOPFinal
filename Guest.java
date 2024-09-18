import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class Guest {
    private String name;
    private String ICNumber;
    private String email;
    private String phoneNumber;
    private List<Reservation> reservations;

    public Guest(String name, String ICNumber, String email, String phoneNumber) {
        this.name = name;
        this.ICNumber = ICNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }

    public Reservation createReservation(Room room) {
        String reservationNumber = generateRandomString(8);
        Reservation reservation = new Reservation(reservationNumber, room, this, new Date());
        reservations.add(reservation);
        return reservation;
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getICNumber() {
        return ICNumber;
    }

    public void setICNumber(String ICNumber) {
        this.ICNumber = ICNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}