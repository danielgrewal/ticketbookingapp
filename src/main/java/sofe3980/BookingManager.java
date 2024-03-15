package sofe3980;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookingManager {

    // If we are using a database, this will change to use that instead for storing
    // bookings
    private List<Booking> bookings;

    public BookingManager() {
        this.bookings = new ArrayList<>();
    }

    /**
     * Creates a new booking with the provided user, list of flights, and booking
     * type,
     * and adds it to the list of bookings.
     * 
     * @param user        The user making the booking.
     * @param flights     The list of flights included in the booking.
     * @param bookingType The type of booking (one-way, round-trip).
     * @return The created Booking object.
     */
    public Booking createBooking(User user, List<Flight> flights, String bookingType) {
        Booking newBooking = new Booking(user, flights, bookingType);
        // set bookingId, calculate totalPrice, generate tickets, etc. all here
        bookings.add(newBooking);
        return newBooking;
    }

    /**
     * Cancels an existing booking by removing it from the list of bookings.
     * 
     * @param bookingId The ID of the booking to cancel.
     * @return true if the booking was successfully canceled, false otherwise.
     */
    public boolean cancelBooking(int bookingId) {
        return bookings.removeIf(booking -> booking.getBookingId() == bookingId);
    }

    /**
     * Retrieves a booking by its ID.
     * 
     * @param bookingId The ID of the booking to retrieve.
     * @return An Optional containing the Booking if found, or an empty Optional
     *         otherwise.
     */
    public Optional<Booking> getBookingById(int bookingId) {
        return bookings.stream().filter(booking -> booking.getBookingId() == bookingId).findFirst();
    }

    // Additional methods can go here

}
