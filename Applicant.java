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
public class Applicant {
    private String DOB;
    //private ApplicationBand Band;
    private ArrayList <Application>myApplication;
    private String jobStatus;
    private ArrayList<String>intrests;
    private ArrayList<String>Achivments;

    public ArrayList<Application> getMyApplication() {
        return myApplication;
    }

    public void setMyApplication(ArrayList<Application> myApplication) {
        this.myApplication = myApplication;
    }
    
    /*public void setBand(ApplicationBand Band) {
        this.Band = Band;
    }

    public ApplicationBand getBand() {
        return Band;
    }*/

    public String getDOB() {
        return DOB;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public ArrayList<String> getIntrests() {
        return intrests;
    }

    public ArrayList<String> getAchivments() {
        return Achivments;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public void setIntrests(ArrayList<String> intrests) {
        this.intrests = intrests;
    }

    public void setAchivments(ArrayList<String> Achivments) {
        this.Achivments = Achivments;
    }
    
    //void EditProfile()
    
    
}
