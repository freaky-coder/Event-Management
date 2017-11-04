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
public class Manager extends User {
    
   public Manager(String ID, String name, char gender, long contactNum, String EnrollNum, String eMailID, String collegeID, int userType, String username, String password) 
    {
        // Type 2 = Manger
        super(ID,name,gender,contactNum,EnrollNum,eMailID,collegeID,userType,username,password);
    }
    
}
