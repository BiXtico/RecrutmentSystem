/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

/**
 *
 * @author mahmo
 */
public class Application extends ApplicationConsole {
    private int AppID;
    private boolean status;
    private int YearsOfExperiance;
    private String proposal;
    private int JobID;

    public Application(int AppID, boolean status, int YearsOfExperiance, String proposal, int JobID) {
        this.AppID = AppID;
        this.status = status;
        this.YearsOfExperiance = YearsOfExperiance;
        this.proposal = proposal;
        this.JobID = JobID;
        
    }

    @Override
    public int getAppID() {
        return AppID;
    }

    public void setAppID(int AppID) {
        this.AppID = AppID;
    }

    public boolean getstatus() {
        return status;
    }

    @Override
    public void setstatus(boolean Approved) {
        this.status = Approved;
    }
    
    @Override
     public  boolean checkjobid(int s){
        if(this.JobID ==s)
            return true;
        else
            return false;
    }
    public int getYearsOfExperiance() {
        return YearsOfExperiance;
    }

    public void setYearsOfExperiance(int YearsOfExperiance) {
        this.YearsOfExperiance = YearsOfExperiance;
    }

    public int getJobID() {
        return JobID;
    }

    public void setJobID(int JobID) {
        this.JobID = JobID;
    }
      
    @Override
    public String displayApp(){
        return("Application:  " + "\nAppID=" + AppID + ".\nApproved: " + status + ".\nProposal: " + proposal +
                ".\nYearsOfExperiance: " + YearsOfExperiance  + '.');
    }
}
