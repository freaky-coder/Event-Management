/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ayush
 */
public class Login {
    String username;
    String password;
    int loginType;
    
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    AddUser au = new AddUser();
    public boolean isValid() throws IOException
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
        loginType= obj.read();
        switch(loginType)
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
        return false;
    }
    
}
