/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozattend;

/**
 *
 * @author Aaron
 */
public class Admin extends Organizer{
    
    public Admin(Participant adm){
        super(adm);
        getAuth();
        OzAttend.addAdmin(this);
    }
    
    protected void getAuth(){
        evt = OzAttend.getEventList();
    }
}
