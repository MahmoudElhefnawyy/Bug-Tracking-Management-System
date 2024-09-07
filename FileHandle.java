/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bug_tracking_system3;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ahmed Mohamed
 */
public class FileHandle {

    public static int createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                return 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void writeToFile(File file, String content) {
        try ( FileWriter writer = new FileWriter(file, true);  BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFromFile(File file) {
        List<String> content = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void Replace(File targetfile, String originalcontent, String updatedcontent) {
        try {
            StringBuilder fileContent = new StringBuilder();
            try ( BufferedReader reader = new BufferedReader(new FileReader(targetfile))) {
                String line="";
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line).append("\n");
                }
            }
            String updatedContent = fileContent.toString().replace(originalcontent, updatedcontent);
            try ( BufferedWriter writer = new BufferedWriter(new FileWriter(targetfile))) {
                writer.write(updatedContent);
            }
        } catch (IOException e) {
            System.err.println("Error updating file content: " + e.getMessage());
        }
    }
}