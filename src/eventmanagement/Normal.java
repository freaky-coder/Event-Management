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
public class Normal extends User{
    
    public Normal(String ID, String name, char gender, long contactNum, int EnrollNum, String eMailID, String collegeID, int userType, String username, String password) 
    {
        // Type 0 = Normal
        super(ID,name,gender,contactNum,EnrollNum,eMailID,collegeID,userType,username,password);
    }

    Normal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void selectEvent()
    {
        
    }
    
// Mandatory for a normal user to get associated with a team    
    public void selectTeam()
    {
        
    }
    
    public boolean Payment()
    {
        return false;
    }
    
}
