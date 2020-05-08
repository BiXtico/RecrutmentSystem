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
public class Message {
    private int ID;
    private String Content;
    private String EmployerInfo;
     private String ApplicantInfo;

      public Message(String Content, String EmployerInfo, String ApplicantInfo) {
        this.Content = Content;
        this.EmployerInfo = EmployerInfo;
        this.ApplicantInfo = ApplicantInfo;
    }

    public Message(int ID, String Content, String EmployerInfo, String ApplicantInfo) {
        this.ID = ID;
        this.Content = Content;
        this.EmployerInfo = EmployerInfo;
        this.ApplicantInfo = ApplicantInfo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getEmployerInfo() {
        return EmployerInfo;
    }

    public void setEmployerInfo(String EmployerInfo) {
        this.EmployerInfo = EmployerInfo;
    }

    public String getApplicantInfo() {
        return ApplicantInfo;
    }

    public void setApplicantInfo(String ApplicantInfo) {
        this.ApplicantInfo = ApplicantInfo;
    }
    
   
    

}
