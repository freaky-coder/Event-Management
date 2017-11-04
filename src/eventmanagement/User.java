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
public class User {

    String ID;
    String name;
    char gender;
    long contactNum;
    int EnrollNum;
    String eMailID;
    String collegeID;
    int userType; // Type 0 = Normal, Type 1 = Volunteer, Type 2 = Manager, Type 3 = Admin
    String username;
    String password;

    public User(String ID, String name, char gender, long contactNum, int EnrollNum, String eMailID, String collegeID, int userType, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.contactNum = contactNum;
        this.EnrollNum = EnrollNum;
        this.eMailID = eMailID;
        this.collegeID = collegeID;
        this.userType = userType;
        this.username = username;
        this.password = password;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
    
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public long getContactNum() {
        return contactNum;
    }

    public int getEnrollNum() {
        return EnrollNum;
    }

    public String geteMailID() {
        return eMailID;
    }

    public String getCollegeID() {
        return collegeID;
    }

    public int getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
     
}
