/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.io.*;

public class Admin extends Person {

    public Admin(String type, int id, String username, String password) {
        super(type, id, username, password);
    }

    public String viewBug(String file) {
        FileHandle fh = new FileHandle(file);
        String content = fh.fileRead(file);
        return content;
    }
     public static void addPerson(String type, int id, String username, String password) {
        String filePath = "user_info.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Append the user information to the file
            writer.write("Type: " + type + "\n");
            writer.write("ID: " + id + "\n");
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("\n");
        } catch (IOException e) {
            System.err.println("Error writing in the file: " + e.getMessage());
        }
    }
    public static void updatePerson(int Id, String newType,int newID, String newUsername, String newPassword) {
        String filePath = "user_info.txt";
        String tempFilePath = "temp_user_info.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {

            String line;
            boolean userFound = false;

            while ((line = reader.readLine()) != null) {
                // Check if the line contains the user's information
                if (line.contains("ID: " + Id)) {
                    userFound = true;
                    // Update the user information
                    writer.write("Type: " + newType + "\n");
                    reader.readLine(); 
                    writer.write("ID: " + newID + "\n");
                    reader.readLine(); 
                    writer.write("Username: " + newUsername + "\n");
                    reader.readLine(); 
                    writer.write("Password: " + newPassword + "\n");
                    writer.write("\n"); 
                } else {
                    writer.write(line + "\n");
                }
            }
            if (!userFound) {
                return;
            }
            boolean success = new File(tempFilePath).renameTo(new File(filePath));
            if (!success) {
                throw new IOException("Could not rename the temporary file.");
            }
        } catch (IOException e) {
            System.err.println("Error updating the user: " + e.getMessage());
        }
    }
    public static void DeletePerson(int id) {
        String filePath = "user_info.txt";
        String tempFilePath = "temp_user_info.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {
            String line;
            boolean userFound = false;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the user's information
                if (line.contains("ID: " + id)) {
                    userFound = true;
                    for (int i = 0; i < 4; i++) {
                        reader.readLine();
                    }
                } else {
                    writer.write(line + "\n");
                }
            }
            boolean success = new File(tempFilePath).renameTo(new File(filePath));
            if (!success) {
                throw new IOException("Could not rename the temporary file.");
            }
        } catch (IOException e) {
            System.err.println("Error deleting the user: " + e.getMessage());
        }
    }
}
