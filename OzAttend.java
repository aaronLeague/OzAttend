/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozattend;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aaron
 */
public class OzAttend {

    private static ArrayList<Event> eventList = new ArrayList<>();
    private static ArrayList<Admin> adminList = new ArrayList<>();
    
    public static ArrayList<Event> getEventList(){
        return eventList;
    }
    
    public ArrayList<Admin> getAdminList(){
        return adminList;
    }
    
    public static void addAdmin(Admin a){
        adminList.add(a);
    }
    
    public static void removeEvent(Event e){
        eventList.remove(e);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Event evt = new Event("", "", "", new Date(), 1, new Organizer(new Participant("", "")));
            System.out.println(evt.getKey());
        }
    }
    
}
