/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayush
 */
public class EventManagement {

    /**
     * @param args the command line arguments
     */
        String ID;
        String name;
        char gender;
        long contactNum;
        int EnrollNum;
        String eMailID;
        String collegeID;
        int userType; // Type 0 = Normal, Type 1 = Volunteer, Type 2 = Manager, Type 3 = Admin
        String username;
        String password;
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        int innerChoice;
        
        ArrayList<User> AllUsers=new ArrayList<>();
        EventManagement em = new EventManagement();
       // User us=new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome to Event Management portal*****");
        System.out.println("\t Now Manage events at ease");
        System.out.print("\n");
        System.out.println("Tell us what to do....");
        System.out.println("Register a User Profile (Normal/Volunteer/Admin/Manager)");
        /*System.out.println("2. Create a Team");
        System.out.println("3. Create an Event");
        System.out.println("4. Check Winner of previous event");
        */
        //choice= sc.nextInt();
        //switch(choice)
        int User_enrol=0;
        int Type=2;
       // us=em.createUser(User_enrol);
       // Type=us.getUserType();
       // AllUsers.add(us);
        switch(Type)
        {
            case 1: //Normal
            {
                
            }
            case 2: //Volunteer
            {
                
            }
            case 3: //Admin
            {
                
            }
            case 4: //Manager
            {
                
            }
        }
        
        /*
        {
            case 1:
            {
               em.createUser();                
            }
            case 2:
            {
                
            }
            case 3:
            {
                
            }
            case 4:
            {
                
            }
        }*/
                }
    
    public void createUser(int User_enrol)
    {
                System.out.println("1. Create Normal User"); //Type 0
                System.out.println("2. Create a Volunteer Profile"); //Type 1
                System.out.println("3. Create an Admin"); //Type 2
                System.out.println("4. Create a Manager Profile"); //Type 3
                int ch;// For user type
                Scanner sc = new Scanner(System.in);
                ch=sc.nextInt();
                User_enrol=User_enrol+1;
                System.out.println("---Enter your details---");
                //User us=new User();
                //us.NewUser(ch,User_enrol);
                
              //  return us;
    }
    
    public void NewUser(int choice,int User_enrol) {
        
        //this.ID = ID;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:  ");
        this.name = sc.next();
        System.out.println("Enter gender: (F)emale/(M)ale/(N)ondisclosed");
        this.gender = sc.next().charAt(0);
        System.out.println("Enter your contact number: ");
        this.contactNum = sc.nextLong();
        this.EnrollNum = User_enrol;
        System.out.println("Enter your email Address: ");
        this.eMailID = sc.next();
        System.out.println("Enter your College ID:");
        this.collegeID = sc.next();
        this.userType = choice;
        System.out.println("Enter a username:");
        this.username = sc.next();
        System.out.println("Enter a password:");
        this.password = sc.next();
 
        //To create unique UserID:
        this.ID=this.name.substring(1,4)+this.EnrollNum;
        
     }
     
    
}
