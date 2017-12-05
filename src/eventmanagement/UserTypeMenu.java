/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

/**
 *
 * @author Ayush
 */

// This Class will contain all the internal menu and method for each and every type of user
public class UserTypeMenu {
    
    public void normalMenu()
    {
        // Menu given to a normal user
        System.out.println("1. Add yourself to an existing team");
        System.out.println("2. Select an event");
    }
    
    public void volunteerMenu()
    {
      // Menu given to a volunteer  
        System.out.println("1. Check other participants in the team");
        System.out.println("2. Check team details");
        
    }
    
    public void managerMenu()
    {
        // Menu provided to a Manager
        System.out.println("1. Add Volunteers to your team");
        System.out.println("2. Check other participants details");
        System.out.println("3. Check team details");
        System.out.println("4. Check winner details");
 
    }
    
    public void adminMenu()
    {
        // Menu for an Admin
        
        System.out.println("1. Add Volunteers to your team");
        System.out.println("2. Add manager");
        System.out.println("3. Add event");
        System.out.println("4. Check other participants details");
        System.out.println("5. Check team details");    }
}
