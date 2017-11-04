/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

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
        Scanner sc = new Scanner(System.in);
        EventManagement em = new EventManagement();
        System.out.println("*****Welcome to Event Management portal*****");
        System.out.println("\t Now Manage events at ease");
        System.out.print("\n");
        System.out.println("Tell us what to do....");
        System.out.println("1. Register a User Profile (Normal/Volunteer/Admin/Manager)");
        System.out.println("2. Create a Team");
        System.out.println("3. Create an Event");
        System.out.println("4. Check Winner of previous event");
        choice= sc.nextInt();
        switch(choice)
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
        }
                }
    
    public void createUser()
    {
                System.out.println("1. Create Normal User");
                System.out.println("2. Craete a Volunteer Profile");
                System.out.println("3. Create an Admin");
                System.out.println("4. Create a Manager Profile");
    }
    
}
