package sofe3980;

import sofe3980.Flight;
import sofe3980.Booking;
import sofe3980.BookingManager;
import sofe3980.FlightManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    private final BookingManager bookingManager;
    private final FlightManager flightManager;

    @Autowired
    public APIController(BookingManager bookingManager, FlightManager flightManager) {
        this.bookingManager = bookingManager;
        this.flightManager = flightManager;
    }

    // Example endpoint for retrieving all flights
    @GetMapping("/flights")
    public List<Flight> getAllFlights() {
        return flightManager.getWeeklyFlights();
    }

    // Example endpoint for creating a new booking
    @PostMapping("/bookings")
    public Booking createBooking(@RequestBody Booking booking) {
        // Assuming Booking class has necessary details like user, flights, etc.
        return bookingManager.createBooking(booking.getUser(), booking.getFlights(), booking.getBookingType());
    }

    // Example endpoint for retrieving a booking by ID
    @GetMapping("/bookings/{id}")
    public Booking getBookingById(@PathVariable int id) {
        // Implementation to fetch booking by ID
        return null; // Placeholder return
    }

    // Additional endpoints for updating and deleting bookings can be added here

}
