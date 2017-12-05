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
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        long temp;
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
           
        String numInput,tempcollege,tempuser,temppass;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:  ");
        this.name = br.readLine();
        System.out.println("Enter gender: (F)emale/(M)ale/(N)ondisclosed");
        this.gender = (char)br.read();
        System.out.println("Enter your contact number: ");
        temp= sc.nextLong();
        this.contactNum = temp;
        System.out.println("Enter your email Address: ");
        numInput = sc.next();
        this.eMailID  = numInput;
        System.out.println("Enter your College ID:");
        tempcollege = sc.next();
        this.collegeID  = tempcollege;
        this.userType = choice;
        System.out.println("Enter a username:");
        //this.username = br.readLine();
        tempuser=sc.next();
        this.username=tempuser;
        System.out.println("Enter a password:");
        temppass = sc.next();
        this.password=temppass;
        //this.ID=this.name.substring(1,4)+this.EnrollNum;  //To create unique UserID
        //Depending on the usertype; insert into that object type; either normal, volunteer etc
        this.EnrollNum = User_enrol;
        switch(choice)
        {
            case 1: 
            {
                
                n_t.ID="nor"+this.name.substring(0,3)+this.EnrollNum;
                n_t.username=username;
                n_t.setCollegeID(collegeID);
                n_t.setContactNum(contactNum);
                n_t.setEnrollNum(EnrollNum);
                n_t.setGender(gender);
                n_t.seteMailID(eMailID);
                n_t.setName(name);
                n_t.password=password;
                normal.add(n_t);
                System.out.println("Your user generated ID is: "+n_t.ID);
                break;
            }
            case 2:
            {
                v_t.ID="vol"+this.name.substring(0,3)+this.EnrollNum;
                v_t.username=username;
                v_t.setCollegeID(collegeID);
                v_t.setContactNum(contactNum);
                v_t.setEnrollNum(EnrollNum);
                v_t.setGender(gender);
                v_t.seteMailID(eMailID);
                v_t.setName(name);
                v_t.password=password;
                volunteer.add(v_t);
            
                System.out.println("Your user generated ID is: "+v_t.ID);
                break;
            }    
            case 3:
            {
                a_t.ID="ad"+this.name.substring(0,3)+this.EnrollNum;
                a_t.username=username;
                a_t.setCollegeID(collegeID);
                a_t.setContactNum(contactNum);
                a_t.setEnrollNum(EnrollNum);
                a_t.setGender(gender);
                a_t.seteMailID(eMailID);
                a_t.setName(name);
                a_t.password=password;
                admin.add(a_t);
            
                System.out.println("Your user generated ID is: "+a_t.ID);
                break;
            }
            case 4:
            {
                m_t.ID="man"+this.name.substring(0,3)+this.EnrollNum;
                m_t.username=username;
                m_t.setCollegeID(collegeID);
                m_t.setContactNum(contactNum);
                m_t.setEnrollNum(EnrollNum);
                m_t.setGender(gender);
                m_t.seteMailID(eMailID);
                m_t.setName(name);
                m_t.password=password;
                manager.add(m_t);
                System.out.println("Your user generated ID is: "+m_t.ID);
                break;
            }
        }
        }
}
