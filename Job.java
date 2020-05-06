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
public class Job implements Job_Read_Only{
    
    private String title; 
    private String description;
    private float salary;
    private int workingHours;
    private boolean Adminapproval;
    private String JobCategory;
    private int NumberOfAvilablePositions;
    private int ExprienceNeeded;
    private String CareerLevel;
    public static ArrayList<Job> AllJobs;
    public  ArrayList <Application> ApplicationList;

    

    public Job(String title, String description, float salary, int workingHours, String JobCategory, int NumberOfAvilablePositions, int ExprienceNeeded, String CareerLevel) {
        this.title = title;
        this.description = description;
        this.salary = salary;
        this.workingHours = workingHours;
        this.JobCategory = JobCategory;
        this.NumberOfAvilablePositions = NumberOfAvilablePositions;
        this.ExprienceNeeded = ExprienceNeeded;
        this.CareerLevel = CareerLevel;
        this.Adminapproval=false;
        AllJobs.add(this);

    }

  
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public boolean isAdminapproval() {
        return Adminapproval;
    }

    public void setAdminapproval(boolean Adminapproval) {
        this.Adminapproval = Adminapproval;
    }

    public String getJobCategory() {
        return JobCategory;
    }

    public void setJobCategory(String JobCategory) {
        this.JobCategory = JobCategory;
    }

    public int getNumberOfAvilablePositions() {
        return NumberOfAvilablePositions;
    }

    public void setNumberOfAvilablePositions(int NumberOfAvilablePositions) {
        this.NumberOfAvilablePositions = NumberOfAvilablePositions;
    }

    public int getExprienceNeeded() {
        return ExprienceNeeded;
    }

    public void setExprienceNeeded(int ExprienceNeeded) {
        this.ExprienceNeeded = ExprienceNeeded;
    }

    public String getCareerLevel() {
        return CareerLevel;
    }

    public void setCareerLevel(String CareerLevel) {
        this.CareerLevel = CareerLevel;
    }

   
//public void DestroyJob(){}
}
