package sofe3980;

import sofe3980.Flight;
import java.time.LocalTime;
import java.util.List;

public class Utilities {

    /**
     * Converts time from 24-hour format to 12-hour format.
     * @param time The time in 24-hour format.
     * @return The time in 12-hour format.
     */
    public static String convertTo12HourFormat(LocalTime time) {
        // Implementation
        return null;
    }

    /**
     * Converts time from 12-hour format to 24-hour format.
     * @param time The time in 12-hour format.
     * @return The time in 24-hour format.
     */
    public static LocalTime convertTo24HourFormat(String time) {
        // Implementation
        return null;
    }

    /**
     * Validates that the selected flights do not form a cyclic trip, i.e.,
     * a trip where a multi-stop flight returns to the same airport.
     * @param flights The list of flights to validate.
     * @return true if the trip is non-cyclic, false otherwise.
     */
    public static boolean validateNonCyclic(List<Flight> flights) {
        // Implementation
        return true;
    }

}