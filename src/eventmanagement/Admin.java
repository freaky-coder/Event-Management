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
public class Admin extends User {

  public Admin(String ID, String name, char gender, long contactNum, String EnrollNum, String eMailID, String collegeID, int userType, String username, String password) 
    {
        // Type 3 = Admin
        super(ID,name,gender,contactNum,EnrollNum,eMailID,collegeID,userType,username,password);
    }
    
    
    
}
