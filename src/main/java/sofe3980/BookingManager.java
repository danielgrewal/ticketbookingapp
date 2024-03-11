package sofe3980;

import sofe3980.Booking;
import sofe3980.Flight;
import sofe3980.User;

import java.util.List;

public class BookingManager {

    /**
     * Creates a new booking with the provided user, list of flights, and booking type.
     * @param user The user making the booking.
     * @param flights The list of flights included in the booking.
     * @param bookingType The type of booking (e.g., one-way, round-trip).
     * @return The created Booking object.
     */
    public Booking createBooking(User user, List<Flight> flights, String bookingType) {
        // Implementation to create a new booking and save it to the database or in-memory store

        return new Booking(); // Placeholder return
    }

    /**
     * Cancels an existing booking.
     */
    public void cancelBooking(int bookingId) {
        // Implementation
    }
}