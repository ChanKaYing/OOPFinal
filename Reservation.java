import java.util.Date;

class Reservation {
    private String reservationNumber;
    private Room room;
    private Guest guest;
    private Date reservationDate;

    public Reservation(String reservationNumber, Room room, Guest guest, Date reservationDate) {
        this.reservationNumber = reservationNumber;
        this.room = room;
        this.guest = guest;
        this.reservationDate = reservationDate;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
