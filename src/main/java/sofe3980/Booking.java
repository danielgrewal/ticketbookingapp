package sofe3980;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private int bookingId;
    private User user;
    private List<Flight> flights;
    private String bookingType;
    private LocalDateTime bookingTime;
    private double totalPrice;
    private List<Ticket> tickets;

    /**
     * Constructs a new Booking object with the given user, flights, and booking
     * type.
     * The booking time is set to the current time, and the tickets list is
     * initialized.
     *
     * @param user        The user making the booking.
     * @param flights     The list of flights included in the booking.
     * @param bookingType The type of the booking (e.g., one-way, round-trip).
     */
    public Booking(User user, List<Flight> flights, String bookingType) {
        this.user = user;
        this.flights = flights;
        this.bookingType = bookingType;
        this.bookingTime = LocalDateTime.now();
        this.tickets = new ArrayList<>();
    }

    // Getters

    public long getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public String getBookingType() {
        return bookingType;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    // Setters

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    /**
     * Generates tickets for each flight in this booking.
     * 
     */
    public String generateTickets(List<Ticket> tickets) {
        // print the ticket info in some readable way
        return null;
    }
    
    /**
     * Generates tickets for each flight in this booking.
     * 
     */
    public double calculateTotalPrice(List<Flight> flights) {
        return (Double) null;
    }

    // A easier way to print and debug the Booking object fields during development
    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", user=" + user +
                ", flights=" + flights +
                ", bookingType='" + bookingType + '\'' +
                ", bookingTime=" + bookingTime +
                ", totalPrice=" + totalPrice +
                ", tickets=" + tickets +
                '}';
    }
}
