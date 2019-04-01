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
public class Participant implements Comparable<Participant>{

    private String name, email, password;
    private ArrayList<Organizer> myEvts = new ArrayList<>();
    private Organizer org;

    public Participant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Participant(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getEmail() {
        return email;
    }

    protected String getPassword() {
        return password;
    }
    
    protected void setPassword(String password) {
        this.password = password;
    }
    
    private void checkOrg(){
        if (org == null)
            org = new Organizer(this);
    }
    
    protected Organizer getOrg(){
        checkOrg();
        return org;
    }
    
    public void setAdmin() {
        org = new Admin(this);
    }

    public void createEvent(String eventName, String buildingName,
            String roomNumber, Date date, int time) {
        checkOrg();
            org.addEvt(new Event(eventName, buildingName,
                roomNumber, date, time, org));
    }
    
    public void signIn(Event evt){
        evt.addAttendee(this);
    }
    
    @Override
    public int compareTo(Participant p){
        return this.email.compareTo(p.getEmail());
    }
}
