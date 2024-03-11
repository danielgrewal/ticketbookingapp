package sofe3980;

import java.util.List;

public class Booking {

    // Booking attributes like bookingId, user, flights, bookingType, bookingTime, etc.
    private User user;
    private List<Flight> flights;
    private String bookingType;

    // Constructor, other methods, and attributes

    /**
     * Gets the user associated with this booking.
     * @return The user who made the booking.
     */
    public User getUser() {
        return user;
    }

    /**
     * Gets the list of flights included in this booking.
     * @return The flights that are part of this booking.
     */
    public List<Flight> getFlights() {
        return flights;
    }

    /**
     * Gets the type of this booking (e.g., one-way, round-trip).
     * @return The booking type.
     */
    public String getBookingType() {
        return bookingType;
    }

    /**
     * Generates a ticket for the booking with details.
     */
    public void generateTicket() {
        // Implementation
    }
}