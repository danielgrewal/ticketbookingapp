# Airline Ticket Booking Application

This Spring Boot application provides a simple backend for an airline ticket booking system. It allows users to view available flights, book tickets, and manage their bookings.

## Features

- View weekly available direct and multi-stop flights
- Book one-way or round-trip tickets
- Manage bookings (create, view, and cancel bookings)
- RESTful API for integration with front-end applications

## Getting Started

### Prerequisites

- JDK 1.8 or later
- Maven 3.2+

### Running the Application

1. Clone the repository:

2. Navigate to the project root directory (where pom.xml file is located)

3. Build the project using Maven:

   ```
   mvn clean install
   ```

4. Run the application:

   ```
   mvn spring-boot:run
   ```

   The application will start running at <http://localhost:8080>.

## REST API Endpoints

- `GET /api/flights`: Retrieves a list of all available flights for the week.
- `POST /api/bookings`: Creates a new booking based on the provided booking details.
- `GET /api/bookings/{id}`: Retrieves the booking details for the specified booking ID.

## Running Tests

Execute the following command to run unit and integration tests:

```
mvn test
```

## Technologies

- Spring Boot 2.4.5
- Maven
- JUnit 4 & 5 for unit and integration testing
- Mockito for mocking
