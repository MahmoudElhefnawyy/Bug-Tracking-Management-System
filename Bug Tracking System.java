/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bug_tracking_system3;

/**
 *
 * @author Mahmoud Mohamed
 */
import java.io.*;

public class Bug_Tracking_System3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define A file
        File bug = new File("Bug.txt");
        File person = new File("person.txt");
        FileHandle.createFile("Bug.txt");
        FileHandle.createFile("person.txt");
        
        //Store Bugs to Bug File
        Bug.AssignNewBug("Bug1", "Critical", "Level 1", "opended", "2023-12-5", "Tracking System 1 ","Mahmoud","Mohamed", bug);
        Bug.AssignNewBug("Bug2", "Major", "Level 2", "closed", "2023-12-6", "Tracking System 2 ","Ahmed", "Omer",bug);
        Bug.AssignNewBug("Bug3", "senior", "Level 3", "opened", "2023-12-7", "Tracking System 3 ","Adel","salem", bug);
        
        //Store users to person File
        Tester.SignUp("Tester",20220446,"Mahmoud","pass446") ;
        Tester.SignUp("Tester",20220558,"Ahmed","pass558") ;
        Developer.SignUp("Developer",20220223,"Mohamed","pass223");
        Developer.SignUp("Developer",20220556,"Omer","pass556");
        ProjectManager.SignUp("ProjectManager",20220445,
                "Waheed","pass445");
        Admin.SignUp("Admin",20220123,"Adel","pass221");
        
        //View Menu
        Menu.mainmenu();
    }

}
