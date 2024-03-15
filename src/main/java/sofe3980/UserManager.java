package sofe3980;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserManager {

    // If we are using a database, this will change to use that instead for storing
    // users
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    /**
     * Registers a new user with the given details and adds the user to the list of
     * registered users.
     * 
     * @param name  The name of the user.
     * @param email The email address of the user.
     * @return The newly registered User object.
     */
    public User registerUser(String name, String email) {
        User newUser = new User(name, email); // Assuming User has an appropriate constructor
        users.add(newUser);
        return newUser;
    }

    /**
     * Attempts to log in a user with the given email address.
     * 
     * @param email The email address of the user attempting to log in.
     * @return An Optional containing the User object if login is successful, or an
     *         empty Optional otherwise.
     */
    public Optional<User> loginUser(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    /**
     * Retrieves a user by their ID.
     * 
     * @param userId The ID of the user to retrieve.
     * @return An Optional containing the User object if found, or an empty Optional
     *         otherwise.
     */
    public Optional<User> getUserById(long userId) {
        return users.stream()
                .filter(user -> user.getUserId() == userId)
                .findFirst();
    }
}
