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
public class Team {

    String ID;
    String eventID;
    int teamSize;
    
    public Team(String ID, String eventID, int teamSize) {
        this.ID = ID;
        this.eventID = eventID;
        this.teamSize = teamSize;
    }
  
}
