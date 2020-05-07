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
    public String getTitle() throws Exception;
    public float getSalary()throws Exception;
    public int getWorkingHours()throws Exception;
    public String getJobCategory()throws Exception;
    public int getNumberOfAvilablePositions()throws Exception;
    public int getExprienceNeeded()throws Exception;
    public String getCareerLevel()throws Exception;
}
