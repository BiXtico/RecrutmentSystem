/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.util.ArrayList;

/**
 *
 * @author mahmo
 */
public class ApplicationBand extends ApplicationConsole {

    private int ID;
    private String Type;
    private String Groupdescription;
    
    private ArrayList<ApplicationConsole> Apps = new ArrayList();

    public ApplicationBand(int ID, String Type, String Groupdescription) {
        this.ID = ID;
        this.Type = Type;
        this.Groupdescription = Groupdescription;
    }

    public String getGroupdescription() {
        return Groupdescription;
    }

    public void setGroupdescription(String Groupdescription) {
        this.Groupdescription = Groupdescription;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<ApplicationConsole> getApps() {
        return Apps;
    }

    public void setApps(ArrayList<ApplicationConsole> Apps) {
        this.Apps = Apps;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    @Override
    public void addApp(ApplicationConsole Appcon){
        Apps.add(Appcon);
    }
    @Override
    public void removeApp(ApplicationConsole Appcon){
        Apps.remove(Appcon);
    }
    @Override
    public ApplicationConsole getApp(int bandid){
        
        return Apps.get(bandid);
    }
    
    public void DisplayApp(){
        for(ApplicationConsole A: Apps){
            A.displayApp();
        }
    }

}
