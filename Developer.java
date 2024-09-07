/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.io.*;
public class Developer extends Person {

    public Developer(String type, int id, String username, String password) {
        super(type, id, username, password);
    }

    public static void viewBugs(String filepath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    public static void changeBugStatus(String filePath, String bugName, String newStatus) {
        String tempFilePath = "temp_bug_info.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {

            String line;
            boolean bugFound = false;
            while ((line = reader.readLine()) != null) {
                String[] bugInfo = line.split(","); // Assuming bugs are comma-separated
                if (bugInfo.length >= 5) {
                    String name = bugInfo[0].trim();
                    if (name.equals(bugName)) {
                        bugFound = true;
                        bugInfo[4] = newStatus;
                        line = String.join(", ", bugInfo);
                        System.out.println("Bug '" + bugName + "' status changed to '" + newStatus + "'.");
                    }
                }
                writer.write(line + "\n");
            }
            boolean success = new File(tempFilePath).renameTo(new File(filePath));
            if (!success) {
                throw new IOException("Could not rename the temporary file.");
            }
        } catch (IOException e) {
            System.err.println("Error updating bug status: " + e.getMessage());
        }
    }
}
