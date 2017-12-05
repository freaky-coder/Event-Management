/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
       
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int choice;
        int registeredCount=0;
        int innerChoice;
        boolean loggedIn = false;
       // ArrayList<User> AllUsers=new ArrayList<>();
        EventManagement em = new EventManagement();
       // User us=new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome to Event Management portal*****");
        System.out.println("\t Now Manage events at ease");
        System.out.print("\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char temp= 'y';
        
        while(temp!='n')
        {
        System.out.println("Tell us what to do....");
        System.out.println("1. Login to your system");
        System.out.println("2. Register a User Profile (Normal/Volunteer/Admin/Manager)");
        System.out.println("3. Create a Team");
        System.out.println("4. Create an Event");
        System.out.println("5. Check Winner of previous event");
        System.out.println("----------------------------------------");
        choice= sc.nextInt();
        switch(choice)
        {
            case 1: 
            {
                Login login = new Login();
                loggedIn= login.isLogin();
                System.out.println("Check");
            }
            case 2: 
            {
                registeredCount+=1;
                em.createUser(registeredCount);
                System.out.println("Profile Added to Database Successfully!!");
            }
            case 3:
            {
                if(loggedIn==true)
                {
                    
                }
                else
                    System.out.println("You cannot do any modifications without logging in. Please log in and try again");
            }
            case 4:
            {
                
            }
            
        }
        System.out.println("Do you want to continue? (y/n)");
        temp= (char)br.read();
        
                }
    }
    
    public void createUser(int User_enrol) throws IOException
    {
                System.out.print("\n");
                System.out.println("Which type of User you are?"); 
                System.out.println("-----------------------------------------");
                System.out.println("1. A Normal User"); //Type 0
                System.out.println("2. A Volunteer"); //Type 1
                System.out.println("3. An Admin"); //Type 2
                System.out.println("4. A Manager"); //Type 3
                int ch;// For user type
                Scanner sc = new Scanner(System.in);
                ch=sc.nextInt();
                AddUser au = new AddUser();
                au.AddUsers(ch, User_enrol);
    }    
}
