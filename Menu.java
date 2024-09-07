/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bug_tracking_system3;

import java.io.*;
import java.util.*;

/**
 *
 * @author Mahmoud
 */
public class Menu {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    public static void mainmenu() {
        int type, id;
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a user type:");
        System.out.println("1. Tester");
        System.out.println("2. Developer");
        System.out.println("3. Project Manager");
        System.out.println("4. Admin");
        type = input.nextInt();
        switch (type) {
            case 1:
                System.out.println("You are a Tester ,Please Login!");
                System.out.println("Enter your UserName");
                username = input.next();
                System.out.println("Enter your Password");
                password = input.next();
                if (Tester.login(username, password)) {
                    Menu.testermenu();
                } else {
                    System.out.println("Invalid UserName OR PassWord,Try Again");
                }
                break;
            case 2:
                System.out.println("You are a Developer ,Please Login!");
                System.out.println("Enter your UserName");
                username = input.next();
                System.out.println("Enter your Password");
                password = input.next();
                if (Developer.login(username, password)) {
                    Menu.Developermenu();
                } else {
                    System.out.println("Invalid UserName OR PassWord,Try Again");
                }
                break;
            case 3:
                System.out.println("You are a Project Manager ,Please Login!");
                System.out.println("Enter your UserName");
                username = input.next();
                System.out.println("Enter your Password");
                password = input.next();
                if (ProjectManager.login(username, password)) {
                    Menu.projectmanagermenu();
                } else {
                    System.out.println("Invalid UserName OR PassWord,Try Again");
                }
                break;
            case 4:
                System.out.println("You are an Admin ,Please Login!");
                System.out.println("Enter your UserName");
                username = input.next();
                System.out.println("Enter your Password");
                password = input.next();
                if (Admin.login(username, password)) {
                    Menu.Adminrmenu();
                } else {
                    System.out.println("Invalid UserName OR PassWord,Try Again");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }

    public static void testermenu() {
        Scanner tester = new Scanner(System.in);
        System.out.println("Welcome to Tester view.");
        System.out.println("=======================================");
        System.out.println("Enter (1) to define Bug Information.");
        System.out.println("Enter (2) to Assign Bug to Developer.");
        System.out.println("Enter (3) to Exit.");
        switch (tester.nextInt()) {
            case 1: {
                File file=new File("Bug.txt");
                Scanner input = new Scanner(System.in);
                String name = "", type = "", level = "", status = "", date = "", projectName = "",test="";
                System.out.println("Enter the Bug name");
                name = input.nextLine();
                System.out.println("Enter the Bug type");
                type = input.nextLine();
                System.out.println("Enter the Bug level");
                level = input.nextLine();
                System.out.println("Enter the Bug status");
                status = input.nextLine();
                System.out.println("Enter the Bug date");
                date = input.nextLine();
                System.out.println("Enter the projectName");
                projectName = input.nextLine();
                System.out.println("Enter the Tester Name");
                test = input.nextLine();
                Tester.DefineBug(name, type, level, status, date, projectName,test, file);
            }
            break;
            case 2:
            {
                String Dname="",Bname="";
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the Developer Name To assign Bug");
                Dname=input.nextLine();
                System.out.println("Enter the Bug Name");
                Bname=input.nextLine();
                Tester.AssignNewBug(Dname,Bname);
            }
                break;
            case 3:
                System.exit(1);
            default:
                System.out.println("Invalid Choice,please Try Again");
        }
    }

    public static void Developermenu() {
        Scanner developer = new Scanner(System.in);
        System.out.println("Welcome to Developer view.");
        System.out.println("=======================================");
        System.out.println("Enter (1) to view Bugs .");
        System.out.println("Enter (2) to change Bug status.");
        System.out.println("Enter (3) to Exit.");
        switch (developer.nextInt()) {
            case 1:
            {
                String Dname;
                Scanner input=new Scanner(System.in);
                System.out.println("Enter The Developer Name To View Assign Bugs");
                Dname=input.nextLine();    
                System.out.println(Developer.viewAssignedBugs(Dname));
            }
                break;
            case 2:
            {
                String Bname="",Nstatus="",Ostatus="";
                Scanner input=new Scanner(System.in);
                System.out.println("Enter The Name of bug to change status");
                Bname=input.nextLine();   
                System.out.println("Enter The original Status of Bug");
                Ostatus=input.nextLine();
                System.out.println("Enter The New Status of Bug");
                Nstatus=input.nextLine();
                Developer.changeBugStatus(Bname,Ostatus,Nstatus);
            }
                break;
            case 3:
                System.exit(1);
            default:
                System.out.println("Invalid Choice,please Try Again");
        }
    }

    public static void projectmanagermenu() {
        Scanner projectmanager = new Scanner(System.in);
        System.out.println("Welcome to project Manager view.");
        System.out.println("=======================================");
        System.out.println("Enter (1) to check Tester  performance.");
        System.out.println("Enter (2) to check Developer  performance ");
        System.out.println("Enter (3) to Exit.");
        switch (projectmanager.nextInt()) {
            case 1:
            {
                int perform=ProjectManager.checkTesterPerformance();
                System.out.println("The Taster Has Created : "+perform+"  Bug");
            }
                break;
            case 2:
                ProjectManager.checkDeveloperPerformance();
                break;
            case 3:
                System.exit(1);
            default:
                System.out.println("Invalid Choice,please Try Again");
        }
    }

    public static void Adminrmenu() {
        Scanner admin = new Scanner(System.in);
        System.out.println("Welcome to Admin view.");
        System.out.println("=======================================");
        System.out.println("Enter (1) to view Bug.");
        System.out.println("Enter (2) Add a new user.");
        System.out.println("Enter (3) Update a user.");
        System.out.println("Enter (4) Delete a user.");
        System.out.println("Enter (5) to Exit.");
        switch (admin.nextInt()) {
            case 1:
            {
                File file=new File("Bug.txt");
                 System.out.println(Admin.viewAllBugs(file));
            }
                break;
            case 2:
            {
                Scanner input=new Scanner(System.in);
                int id;
                String type="",username="",password="";
                System.out.println("Enter your Type");
                type = input.next();
                System.out.println("Enter your ID");
                id = input.nextInt();
                System.out.println("Enter your UserName");
                username = input.next();
                System.out.println("Enter your Password");
                password = input.next();
                Admin.Addperson(type,id,username,password);
            }
                break;
            case 3:
            {
                int oldId,NID;
                String NType="",Nusername="",Npassword="";
                Scanner input=new Scanner(System.in);
                System.out.println("Enter The old Id To Delete a Person");
                oldId=input.nextInt();
                System.out.println("Enter The New Type of this Person");
                NType=input.nextLine();
                System.out.println("Enter The New ID of this Person");
                NID=input.nextInt();
                System.out.println("Enter The New Username of this Person");
                Nusername=input.nextLine();
                System.out.println("Enter The New password of this Person");
                Npassword=input.nextLine();
                Admin.updatePerson(oldId,NType,NID,Nusername,Npassword);
            }
                break;
            case 4:
            {  
                int id;
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the ID to Delete a user");
                id=input.nextInt();
               Admin.DeletePerson(id);
            }
                break;
            case 5:
                System.exit(1);
            default:
                System.out.println("Invalid Choice,please Try Again");
        }
    }
}
