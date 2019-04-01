/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozattend;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class Organizer {
    
    private final Participant org;
    ArrayList<Event> evt = new ArrayList<>();
    
    public Organizer(Participant org){
        this.org = org;
    }
    
    public void addEvt(Event e){
        evt.add(e);
    }
    
    protected void assignOrg(Participant p, Event e){
        if (evt.contains(e) && e.getOrgs().contains(this))
            e.getOrgs().add(p.getOrg());
    }
        
    protected void removeOrg(Participant p, Event e){
        if (evt.contains(e) && e.getOrgs().size() > 1)
            e.getOrgs().remove(p.getOrg());
    }
    
    protected void removeEvent(Event e){
        evt.remove(e);
        OzAttend.removeEvent(e);
    }
}
