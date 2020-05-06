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
    private ArrayList<ApplicationBand> ApplicationBands;
    private String jobStatus;
    private ArrayList<String> intrests;
    private ArrayList<String> Achivments;

    public ArrayList<ApplicationBand> getApplicationBands() {
        return ApplicationBands;
    }

    public void setApplicationBands(ArrayList<ApplicationBand> ApplicationBands) {
        this.ApplicationBands = ApplicationBands;
    }

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

    //Apply using the composite pattern -- by passing if the a var into the function that defines if the application is going to be added to 
    // an existing Band or create a new one.
    /*public void applyToJob(int APP_ID, float salary, int experience, String type, int workingHours, String jobTitle, String Company) {
        Application A = new Application(APP_ID, salary, experience, type, workingHours, jobTitle, Company);
        myApplication.add(A);
         remember to edit in the class diagram
         remmember to add CV in the declaration 
    }*/
    //apply using the stratagy pattern 
    public void searchForJobs(String v) { //this is a GUI and will be retrived from database 

    }

    public void respondToJobOffer(boolean respond, Job A) {
        if (respond == true) {
            jobStatus = "Employed";
            // currentJob = A;
        }
    }

    public void postAchivment(String achievment) {
        Achivments.add(achievment);
    }

    //make this view application using the composite display app function. u can just display every thing about the app
    /*public void viewApplicationStatus() {
        String v;
        for (int i = 0; i < myApplication.size(); i++) {
            if (myApplication.get(i).isApproved() == true) {
                v = "Accepted";
            } else if (myApplication.get(i).isApproved() == false) {
                v = "Rejected";
            } else {
                v = "Still Pending";
            }
           // System.out.println("Your Application at " + myApplication.get(i).getCompanyName() + " is " + v);
        }

    }*/
    public void addIntrist(String intrist) {
        intrests.add(intrist);
    }

    //override of the user waiting gor it
    public void EditProfile() {

    }

    public void CreateApplicationBand(String name, String Education, int telephone) {
        ApplicationConsole newband = new ApplicationBand(name, Education, telephone);
        ApplicationBands.add((ApplicationBand) newband);
    }
    //apply strategy pattern
    public void Search(){
        
    }

}
