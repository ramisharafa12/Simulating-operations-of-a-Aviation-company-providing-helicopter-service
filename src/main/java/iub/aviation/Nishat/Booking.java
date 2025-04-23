package iub.aviation.Nishat;
public class Booking {
    private String bookingID;
    private String customerID;
    private String flightNumber;
    private String departure;
    private String destination;
    private String status;
    private float cost;

    // Constructor
    public Booking(String bookingID, String customerID, String flightNumber, String departure,
                   String destination, String status, float cost) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.status = status;
        this.cost = cost;
    }

    // Getters and Setters
    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", status='" + status + '\'' +
                ", cost=" + cost +
                '}';
    }
}
