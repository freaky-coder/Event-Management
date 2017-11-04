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


/**
 *
 * @author Ayush
 */
public class AddUser {
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
        
        // ArrayList to store all the data of different kind of users
        ArrayList<Normal> normal = new ArrayList<>();
        ArrayList<Volunteer> volunteer = new ArrayList<>();
        ArrayList<Manager> manager = new ArrayList<>();
        ArrayList<Admin> admin = new ArrayList<>();
        User u = new User();
        Normal normal_temp = new Normal();
        Volunteer volunteer_temp = new Volunteer();
        Manager manager_temp = new Manager();
        Admin admin_temp = new Admin();
        
        public void AddUsers(int choice,int User_enrol) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:  ");
        this.name = br.readLine();
        System.out.println("Enter gender: (F)emale/(M)ale/(N)ondisclosed");
        this.gender = (char)br.read();
        System.out.println("Enter your contact number: ");
        this.contactNum = br.read();
        this.EnrollNum = User_enrol;
        System.out.println("Enter your email Address: ");
        this.eMailID = br.readLine();
        System.out.println("Enter your College ID:");
        this.collegeID = br.readLine();
        this.userType = choice;
        System.out.println("Enter a username:");
        this.username = br.readLine();
        System.out.println("Enter a password:");
        this.password = br.readLine();
        this.ID=this.name.substring(1,4)+this.EnrollNum;  //To create unique UserID
        
     }
}
