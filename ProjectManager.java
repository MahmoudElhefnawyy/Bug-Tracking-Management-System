/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bug_tracking_system3;
/**
 *
 * @author Dell
 */
import java.util.*;
import java.io.*;

public class ProjectManager extends Person {

    public ProjectManager(int id, String username, String password) {
        super("Project Manager", id, username, password);
    }

    public static void monitorBugs() {
        
    }

    public static int checkTesterPerformance() {
        int counter = 0;
        File file = new File("Bug.txt");
        List<String> content = new ArrayList<String>();
        content = FileHandle.readFromFile(file);
        for (String element : content) {
            if (element.contains("Name:")) {
                counter++;
            } 
        }
          return counter;
 }
}
