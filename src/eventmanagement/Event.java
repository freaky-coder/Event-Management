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
public class Event {
       
       String eventID;
       String eventName;
       String department;
       String managerID;
       float amount;
       String eventTypeID;

    public Event(String eventID, String eventName, String department, String managerID, float amount, String eventTypeID) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.department = department;
        this.managerID = managerID;
        this.amount = amount;
        this.eventTypeID = eventTypeID;
    }
       
    public String getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDepartment() {
        return department;
    }

    public String getManagerID() {
        return managerID;
    }

    public float getAmount() {
        return amount;
    }

    public String getEventTypeID() {
        return eventTypeID;
    }      
       
}
