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
        System.out.println("1. Login to your system");
        System.out.println("2. Register a User Profile (Normal/Volunteer/Admin/Manager)");
        System.out.println("3. Create a Team");
        System.out.println("4. Create an Event");
        System.out.println("5. Check Winner of previous event");
        choice= sc.nextInt();
        switch(choice)
        {
            case 1: 
            {
                
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
        }
        
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
}
