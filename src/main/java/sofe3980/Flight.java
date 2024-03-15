package sofe3980;

import java.time.LocalDateTime;

public class Flight {

    private int flightId;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String origin;
    private String destination;
    private boolean isDirectFlight;

    // Constructor
    public Flight(int flightId, LocalDateTime departureTime, LocalDateTime arrivalTime,
            String departureLocation, String destinationLocation, boolean isDirectFlight) {
        this.flightId = flightId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.origin = departureLocation;
        this.destination = destinationLocation;
        this.isDirectFlight = isDirectFlight;
    }

    /**
     * Calculates and returns the duration of the flight.
     * 
     * @return The duration of the flight as a string
     */
    public String calculateDuration() {
        return null;
    }

    // Getters

    public long getFlightId() {
        return flightId;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureLocation() {
        return origin;
    }

    public String getDestinationLocation() {
        return destination;
    }

    public boolean isDirectFlight() {
        return isDirectFlight;
    }

    // Setters

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureLocation(String departureLocation) {
        this.origin = departureLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destination = destinationLocation;
    }

    public void setDirectFlight(boolean isDirectFlight) {
        this.isDirectFlight = isDirectFlight;
    }
}