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
public abstract class User {

    String ID;
    private String name;
    private char gender;
    private long contactNum;
    private int EnrollNum;
    private String eMailID;
    private String collegeID;
    private int userType; // Type 0 = Normal, Type 1 = Volunteer, Type 2 = Manager, Type 3 = Admin

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setContactNum(long contactNum) {
        this.contactNum = contactNum;
    }

    public void setEnrollNum(int EnrollNum) {
        this.EnrollNum = EnrollNum;
    }

    public void seteMailID(String eMailID) {
        this.eMailID = eMailID;
    }

    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
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
