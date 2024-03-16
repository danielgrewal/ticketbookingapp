package sofe3980;

import java.time.LocalDate;

public class User {

    private int userId;
    private String name;
    private String email;
    private String password;
    private LocalDate dob;
    private String passportNumber;

    /**
     * Constructs a User with the specified name and email.
     * 
     * @param name  The name of the user.
     * @param email The email address of the user.
     */
    public User(int userId, String name, String email, String password, LocalDate dob, String passportNumber) {
        this.userId = userId;   // maybe we can autogenerate this
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.passportNumber = passportNumber;
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

    public String getPassword() {
        return password;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

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
