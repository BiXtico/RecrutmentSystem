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
    private boolean Approved;
    private float DesiredSalary;
    private int YearsOfExperiance;
    private String JobType;
    private int WrokingHours;

    public int getAppID() {
        return AppID;
    }

    public void setAppID(int AppID) {
        this.AppID = AppID;
    }

    public boolean isApproved() {
        return Approved;
    }

    public void setApproved(boolean Approved) {
        this.Approved = Approved;
    }

    public float getDesiredSalary() {
        return DesiredSalary;
    }

    public void setDesiredSalary(float DesiredSalary) {
        this.DesiredSalary = DesiredSalary;
    }

    public int getYearsOfExperiance() {
        return YearsOfExperiance;
    }

    public void setYearsOfExperiance(int YearsOfExperiance) {
        this.YearsOfExperiance = YearsOfExperiance;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    public int getWrokingHours() {
        return WrokingHours;
    }

    public void setWrokingHours(int WrokingHours) {
        this.WrokingHours = WrokingHours;
    }
  
    @Override
    public void displayApp(){
        System.out.println("Application:  " + "\nAppID=" + AppID + ".\nApproved: " + Approved + ".\nDesiredSalary: " + DesiredSalary +
                ".\nYearsOfExperiance: " + YearsOfExperiance + ".\nJobType: " + JobType + "\nWrokingHours=" + WrokingHours + '.');
    }
}
