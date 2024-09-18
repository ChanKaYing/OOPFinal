import java.util.Date;

class Room {
    private String roomNumber;
    private Date checkinDate;
    private boolean Available;
    private Date checkoutDate;
    private Date arrivalTime;

    public Room(String roomNumber, Date checkinDate, boolean Available, Date checkoutDate, Date arrivalTime) {
        this.roomNumber = roomNumber;
        this.checkinDate = checkinDate;
        this.Available = Available;
        this.checkoutDate = checkoutDate;
        this.arrivalTime = arrivalTime;
    }



    // Getters and setters for other attributes
    public String getroomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }


    ////

    ////

    public boolean getAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


}