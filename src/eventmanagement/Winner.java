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
public class Winner {
 
    String ID;
    String eventID;
    String userID;
    int position;
       
    public Winner(String ID, String eventID, String userID, int position) {
        this.ID = ID;
        this.eventID = eventID;
        this.userID = userID;
        this.position = position;
    }
    public String getID() {
        return ID;
    }

    public String getEventID() {
        return eventID;
    }

    public String getUserID() {
        return userID;
    }

    public int getPosition() {
        return position;
    }
   
}
