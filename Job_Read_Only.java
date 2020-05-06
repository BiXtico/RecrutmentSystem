/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

/**
 *
 * @author PrinceWanted
 */
public interface Job_Read_Only {
    public String getTitle();
    public float getSalary();
    public int getWorkingHours();
    public String getJobCategory();
    public int getNumberOfAvilablePositions();
    public int getExprienceNeeded();
    public String getCareerLevel();
}
