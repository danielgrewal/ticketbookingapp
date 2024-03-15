package sofe3980;

import java.time.LocalDate;

public class User {

    private int userId;
    private String name;
    private String email;
    private LocalDate dob;
    private String passportNumber;
    // Maybe add password?

    /**
     * Constructs a User with the specified name and email.
     * 
     * @param name  The name of the user.
     * @param email The email address of the user.
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        // userId should be set here, but not sure if we will use a database or just
        // generate an id
    }

    // Getters

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    // Setters

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Additional methods can go here

    // For easier debugging and printing the User object fields
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
