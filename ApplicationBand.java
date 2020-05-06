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

    private String FullName;
    private String Education;
    private int Telephone;
    
    ArrayList<ApplicationConsole> Apps = new ArrayList();

    public ApplicationBand(String FullName, String Education, int Telephone) {
        this.FullName = FullName;
        this.Education = Education;
        this.Telephone = Telephone;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
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
    public ApplicationConsole getApp(int Appcon){
        return Apps.get(Appcon);
    }
    
    public void DisplayApp(){
        for(ApplicationConsole A: Apps){
            A.displayApp();
        }
    }

}
