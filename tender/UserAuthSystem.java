import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class UserAuthSystem {
    private static final String FILE_NAME = "users.txt"; // File to store usernames and hashed passwords

    // Method to hash the password using SHA-256
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    // Method to store the username and hashed password in a file
    public static void signUp(String username, String password) throws IOException, NoSuchAlgorithmException {
        Map<String, String> users = loadUsersFromFile();
        if (users.containsKey(username)) {
            System.out.println("Username already exists.");
            return;
        }

        String hashedPassword = hashPassword(password);
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        writer.write(username + "," + hashedPassword);
        writer.newLine();
        writer.close();
        System.out.println("User signed up successfully.");
    }

    // Method to load users from the file
    public static Map<String, String> loadUsersFromFile() throws IOException {
        Map<String, String> users = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                users.put(parts[0], parts[1]); // username, hashedPassword
            }
        }
        reader.close();
        return users;
    }

    // Method to verify login credentials
    public static boolean login(String username, String password) throws IOException, NoSuchAlgorithmException {
        Map<String, String> users = loadUsersFromFile();
        String hashedPassword = hashPassword(password);
        if (users.containsKey(username) && users.get(username).equals(hashedPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            // Signup Example
            signUp("user1", "password123");

            // Login Example
            if (login("user1", "password123")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed.");
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

