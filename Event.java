/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozattend;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class Event implements Comparable<Event>{
    
    private String eventName, buildingName, roomNumber;
    private String eventKey = "";
    private Date date;
    private int time;
    private boolean active = false;
    private ArrayList<Participant> attendees = new ArrayList<>();
    private ArrayList<Organizer> organizers = new ArrayList<>();
    
    public Event(String eventName, String buildingName, String roomNumber,
            Date date, int time, Organizer org){
        organizers.add(org);
        
        this.eventName = eventName;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.date = date;
        this.time = time;
        
        this.createKey();
    }
    
    private void createKey(){
        char[] pool = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 
            'Y', 'Z'};
        for (int i = 0; i < 6; i++) {
            eventKey += pool[(int) (Math.random() * 25)];
        }
    }
    
    protected String getKey(){
        return eventKey;
    }
    
    protected void activate(){
        active = true;
    }
    
    protected void deactivate(){
        active = false;
    }
    
    protected void addAttendee(Participant att){
        attendees.add(att);
        notifyParticipant(att);
    }
    
    protected Date getDate(){
        return this.date;
    }
    
    protected int getTime(){
        return this.time;
    }
    
    protected String getBuilding(){
        return this.buildingName;
    }
    
    protected String getRoom(){
        return this.roomNumber;
    }
    
    private void notifyParticipant(Participant p){
        //send an email to the attendee
    }
    
    protected ArrayList returnAttendees(){
        return attendees;
    }
    
    protected ArrayList getOrgs(){
        return organizers;
    }

    @Override
    public int compareTo(Event evt) {
        if (this.date.compareTo(evt.getDate()) != 0)
            return this.date.compareTo(evt.getDate());
        if (this.time - evt.getTime() != 0)
            return (this.time - evt.getTime());
        if (this.buildingName.compareToIgnoreCase(evt.getBuilding()) != 0)
            return this.buildingName.compareToIgnoreCase(evt.getBuilding());
        if (this.roomNumber.compareToIgnoreCase(evt.getRoom()) != 0)
            return this.roomNumber.compareToIgnoreCase(evt.getRoom());
        return this.eventKey.compareTo(evt.getKey());
    }
}
