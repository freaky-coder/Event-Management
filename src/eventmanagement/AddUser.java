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
        
        // Temporary objects for adding respective users in an array list
        //User u = new User();
        Normal n_t = new Normal();
        Volunteer v_t = new Volunteer();
        Manager m_t = new Manager();
        Admin a_t = new Admin();
        
        public void AddUsers(int choice,int User_enrol) throws IOException 
        {
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
        //this.ID=this.name.substring(1,4)+this.EnrollNum;  //To create unique UserID
        //Depending on the usertype; insert into that object type; either normal, volunteer etc
        switch(choice)
        {
            case 1: 
            {
                n_t.ID=ID;
                n_t.username=username;
                n_t.password=password;
                normal.add(n_t);
            }
            case 2:
            {
                v_t.ID=ID;
                v_t.username=username;
                v_t.password=password;
                volunteer.add(v_t);
            }    
            case 3:
            {
                this.ID=this.name.substring(1,4)+this.EnrollNum;
                a_t.username=username;
                a_t.setCollegeID(collegeID);
                a_t.setContactNum(contactNum);
                a_t.setEnrollNum(EnrollNum);
                a_t.setGender(gender);
                a_t.seteMailID(eMailID);
                a_t.setName(name);
                a_t.password=password;
                admin.add(a_t);
            }
            case 4:
            {
                m_t.ID=ID;
                m_t.username=username;
                m_t.password=password;
                manager.add(m_t);
            }
        }
        /*
        u.EnrollNum= EnrollNum;
        u.ID= ID;
        u.collegeID = collegeID;
        u.eMailID = eMailID;
        u.gender = gender;
        u.name = name;
        u.userType = userType;
        u.username = username;
        u.password = password;
        */
     }
}
