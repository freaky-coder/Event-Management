/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Ayush
 */
public class Login {
    String username;
    String password;
    int loginType;
    int temp =0;
    Scanner sc=new Scanner(System.in);
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    //AddUser au = new AddUser();
    public boolean isLogin(AddUser au) throws IOException
    {
        if(au.normal.isEmpty())
        {
            System.out.println("No user database found... Please register to login");
            return false;            
        }    
        else
        {
        System.out.println("Enter the Username");
        username= obj.readLine();
        System.out.println("Enter the Password");
        password = obj.readLine();
        System.out.println("Select your login type:");
        System.out.println("1. Normal");
        System.out.println("2. Volunteer");
        System.out.println("3. Manager");
        System.out.println("4. Admin");
        loginType= sc.nextInt();
        switch(loginType)
        {
            case 1:
            {
               //temp=au.normal.indexOf(username);
               //System.out.println("temp="+temp);
               for(Normal norm : au.normal)
               {
                   if(norm.username.equals(username))
                   {    if(norm.password.equals(password))
                       {
                        System.out.println("Welcome "+username+" !");
                       }
                   else 
                       System.out.println("Wrong password entered");
               
                   }
                   else
                       System.out.println("Username doesn't exist");
               }
               
               
               break;
            
            }
            case 2:
            {
                 temp=au.normal.indexOf(username);
               if(password==au.volunteer.get(temp).toString())
               {
                   System.out.println("Welcome "+username+" !");
               } 
               break; 
            }
            case 3: 
            {
                 temp=au.normal.indexOf(username);
               if(password==au.manager.get(temp).toString())
               {
                   System.out.println("Welcome "+username+" !");
               }
               break;
            }
            case 4:
            {
                 temp=au.normal.indexOf(username);
               if(password==au.admin.get(temp).toString())
               {
                   System.out.println("Welcome "+username+" !");
               } 
                break;
            }
        }
        return false;
    }
    }
    
}
