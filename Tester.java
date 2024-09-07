/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bug_tracking_system3;

import java.io.File;
import java.util.*;

/**
 *
 * @author Dell
 */
public class Tester extends Person {
        public Tester(int id, String username, String password) {
        super("Tester", id, username, password);
    }

    public static void DefineBug(String name,String type, String level, String status, String date, String projectName,String tester, File file) {
         String bugDetails = 
                    "Name:"+name+"\n"+
                    "Type: " + type + "\n" +
                    "Level: " + level + "\n" +
                    "Status: " + status + "\n" +
                    "Date: " + date + "\n" +
                    "Project Name: " + projectName + "\n"+
                    "Tester: "+tester+"\n\n";
              FileHandle.writeToFile(file, bugDetails);
      }
   public static void AssignNewBug(String developer ,String BugName) {
          File file=new File("Bug.txt");
          Scanner input=new Scanner("Bug.txt");
          while(input.hasNext())
          {
              String line=input.nextLine();
              if(line.contains("Name: "+BugName))
              {
                  line+=7;
                  line=input.nextLine();
                  line.replace(line,("Developer:  " +developer) ); 
              }
          }
    }
}
