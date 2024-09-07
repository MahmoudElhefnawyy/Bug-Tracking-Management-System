/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bug_tracking_system3;

import java.io.File;

/**
 *
 * @author Dell
 */
public class Bug {

    private String name;
    private String type;
    private String level;
    private String status;
    private String date;
    private String projectName;

    public Bug(String name, String type, String level, String status, String date, String projectName) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.status = status;
        this.date = date;
        this.projectName = projectName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLevel() {
        return level;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public String getProjectName() {
        return projectName;
    }
      public static void AssignNewBug(String name,String type, String level, String status, String date, String projectName ,String tester,String developer, File file) {
            String bugDetails = 
                    "Name: "+name+"\n"+
                    "Type: " + type + "\n" +
                    "Level: " + level + "\n" +
                    "Status: " + status + "\n" +
                    "Date: " + date + "\n" +
                    "Project Name: " + projectName + "\n"+
                    "Tester: "+tester+"\n"+
                    "Developer: "+developer+"\n\n";
               FileHandle.writeToFile(file, bugDetails);
      }
}
