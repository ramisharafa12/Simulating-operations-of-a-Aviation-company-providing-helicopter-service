package iub.aviation.Nishat;

import java.util.Date;

public class Flight {
    private String flightID;
    private String bookingReference;
    private Date departureTime;
    private Date returnTime;
    private String status;

    // Constructor
    public Flight(String flightID, String bookingReference, Date departureTime, Date returnTime, String status) {
        this.flightID = flightID;
        this.bookingReference = bookingReference;
        this.departureTime = departureTime;
        this.returnTime = returnTime;
        this.status = status;
    }

    // Getters and Setters
    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", bookingReference='" + bookingReference + '\'' +
                ", departureTime=" + departureTime +
                ", returnTime=" + returnTime +
                ", status='" + status + '\'' +
                '}';
    }
}
