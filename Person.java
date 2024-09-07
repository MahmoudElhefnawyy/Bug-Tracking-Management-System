/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bug_tracking_system3;

import java.io.*;
import java.util.List;

/**
 *
 * @author Elhefnawy
 */
public class Person {

    private String type;
    private int id;
    protected String username;
    protected String password;

    public Person(String type, int id, String username, String password) {
        this.type = type;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void SignUp(String type, int id, String username, String password) {
        String userInfo = "Type :" + type + "\n" + "ID :" + id + "\n" + "username  :" + username + "\n" + "password  :" + password + "\n";
        File file = new File("person.txt");
        FileHandle.createFile("person.txt");
        FileHandle.writeToFile(file, userInfo);
    }
    public static boolean login(String username, String password) {
        File file = new File("person.txt");
        List<String> fileContent = FileHandle.readFromFile(file);
        if (!fileContent.contains("username :" + username) && fileContent.contains("password :" + password)) {
            return false;
        }
        return true;
    }
}
