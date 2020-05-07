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
public class Applicant extends Account {
    
    private String DOB;
    private ArrayList<ApplicationBand> ApplicationBands;
    private String Address;
    private String jobStatus;
    private ArrayList<String> intrests;
    private ArrayList<String> Achivments;
    private ArrayList<String> MyJobOffers;

    public Applicant(String name, int ID, String email, String username, String password) {
        super(name, ID, email, username, password);
        ApplicationBands = new ArrayList();
        SearchObj = new SearchJobTitle();
    }

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public ArrayList<String> getMyJobOffers() {
        return MyJobOffers;
    }

    public void setMyJobOffers(ArrayList<String> MyJobOffers) {
        this.MyJobOffers = MyJobOffers;
    }
    
    public void applyToJob(int APP_ID, boolean status, int experience, String proposal, int jobid,boolean newband,int bandid,String BandType,String description) {
        Application A = new Application(APP_ID, status, experience, proposal, jobid);
        CreateApplicationBand(bandid,BandType,description,A);
      
    }
    public void applyToJob(int APP_ID, boolean status, int experience, String proposal, int jobid,int bandid) {
        Application A = new Application(APP_ID, status, experience, proposal, jobid);
        ApplicationBands.get(bandid).getApps().add(A);
    }
    
     private void CreateApplicationBand(int id,String type,String description,ApplicationConsole ac) {
        ApplicationConsole newband = new ApplicationBand(id,type,description);
        newband.addApp(ac);
        ApplicationBands.add((ApplicationBand) newband);
    }
     
     public void CreateApplicationBand(int id,String type,String description) {
        ApplicationConsole newband = new ApplicationBand(id,type,description);
        ApplicationBands.add((ApplicationBand) newband);
    }
     public void CreateApplicationBand(int id,String type,String description,int BandID) {
        ApplicationConsole newband = new ApplicationBand(id,type,description);
        ApplicationBands.get(BandID).addApp(newband);
    }
     

    public void respondToJobOffer(int messageid ,String Content,String senderinfo,String reciverinfo) {
       this.getMessages().add(new Message(messageid,Content,senderinfo,reciverinfo));
    }

    
    public void postAchivment(String achievment) {
        Achivments.add(achievment);
    }

    //make this view application using the composite display app function. u can just display every thing about the app
    /*
    public Application TrackApplication() {
        for (ApplicationBand a:ApplicationBands) {
            for(ApplicationConsole c:a.getApps()){
                c.displayApp();
        }
      }   
    }*/
    
    public void addIntrist(String intrist) {
        intrests.add(intrist);
    }

    //do it directly to GUI with set values
    /*@Override
    public void EditProfile(string email,String username) {
        
    }*/

    //apply strategy pattern
    @Override
    public void Search(String s) {
        Search(s);
    }

}
