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
public class Admin extends User {

   AddUser au;
   Scanner sc = new Scanner(System.in);
   int choice;
  public Admin(String ID, String name, char gender, long contactNum, int EnrollNum, String eMailID, String collegeID, int userType, String username, String password) 
    {
        // Type 3 = Admin
        super(ID,name,gender,contactNum,EnrollNum,eMailID,collegeID,userType,username,password);
    }

    Admin(){}
    
  public void addManager()
  {
     choice = getChoiceM(au.manager);
  }
    
  public void addVolunteer()
  {
      
  }
   
  public void addEvent()
  {
      
 
  }
  public int getChoiceM(ArrayList<Manager> arrayList)
  {
     int len;
     len = arrayList.size();
     System.out.println("Select the Manager you want to add.");
     for(int i=0;i<len;i++)
     {
         System.out.println((i+1)+". "+arrayList.get(i));
     }
     return sc.nextInt();
  }
  
     public int getChoiceV(ArrayList<Volunteer> arrayList)
     {
     int len;
     len = arrayList.size();
     for(int i=0;i<len;i++)
     {
         System.out.println((i+1)+". "+arrayList.get(i));
     }
     return sc.nextInt();
    }
  // For checking the participant, payment & to fetch the team details we can use the functions in Manager class
}
