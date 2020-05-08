package recruitmentsystem;

import java.util.*;

public class Employer extends Account {

    private String CompanyName;
    private ArrayList<Job> MyJobs;

    public Employer(String CompanyName, ArrayList<Job> MyJobs, String name, int ID, String email, String username, String password) {
        super(ID, name, email, username, password);
        this.CompanyName = CompanyName;
        this.MyJobs = MyJobs;
        SearchObj = new SearchCandidates();

    }
    public Employer( int ID, String name, String email, String username, String password,String CompanyName) {
        super(ID, name, email, username, password);
        this.CompanyName = CompanyName;
         SearchObj = new SearchCandidates();
    }

    public Employer(int ID, String name, String email, String username, String password) {
        super(ID, name, email, username, password);
         SearchObj = new SearchCandidates();
    }
 
    public ArrayList<ApplicationBand> searchApplication(String s) {
        ArrayList<ApplicationBand> arr = new ArrayList();
        for (Applicant A : RecrutmentControler.getApplicants()) {
            for (ApplicationBand c : A.getApplicationBands()) {
                if (c.getType().equals(s)) {
                    arr.add(c);
                }
            }
        }
        return arr;
    }
  
    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public ArrayList<Job> getMyJobs() {
        return MyJobs;
    }

    public void setMyJobs(ArrayList<Job> MyJobs) {
        this.MyJobs = MyJobs;
    }

    private void CreateJob(String title, String description, float salary, int workingHours, String JobCategory, int NumberOfAvilablePositions, int ExprienceNeeded, String CareerLevel, int id) {
        Job j = new Job(title, description, salary, workingHours, JobCategory, NumberOfAvilablePositions, ExprienceNeeded, CareerLevel, id);
        this.MyJobs.add(j);
    }

    @Override
    public String Search(String s) {
       return SearchObj.search(s);
    }

    //please edit this to work
    /*
   public void EditProfile(Employer e) {
       String Ename,Eemail,Eusername,CompName,Epassword;
       if(Ename!=null){
            this.setName(Ename);
       }
        if(Eemail!=null){
            this.setEmail(Eemail);
       }
       if(Eusername!=null){
            this.setUsername(Eusername);
        } 
        if(CompName!=null){
            this.setCompanyName(CompName);
       }
       if(Epassword!=null){
            this.setPassword(Epassword);
        }
        System.out.println("AccountUpdated");
    }
     */
    private void SendJobOffer(String jobname, int applicantID) {

        for (Job MyJob : MyJobs) {
            if (MyJob.getTitle().equals(jobname)) {
                for (Applicant a : RecrutmentControler.getApplicants()) {
                    if (a.getID() == applicantID) {
                        a.getMessages().add(new Message(0, "You got an offer for job " + jobname + " from " + this.CompanyName + ".", this.CompanyName, a.getUsername()));

                    } else {
                        System.out.print("Cannot find applicant");
                    }

                }
            } else {
                System.out.print("Error sending offer");
            }

        }
    }

    //make it a returnable Array so that we can append it to an jtext field 
    public void DisplayPostedJobs() {

        for (Job MyJob : MyJobs) {

            System.out.println(MyJob.getTitle());
            System.out.println(MyJob.getDescription());
            System.out.println(MyJob.getWorkingHours());
            System.out.println(MyJob.getSalary());
            System.out.println(MyJob.getExprienceNeeded());
            System.out.println(MyJob.getJobCategory());
            System.out.println(MyJob.getNumberOfAvilablePositions());
            System.out.println("\n");
        }

    }

    void ApproveApplication(boolean approval, ApplicationConsole app) {
        app.setstatus(approval);
    }

    public ArrayList<ApplicationConsole> DisplayJobApplications(int JobID) {
        ArrayList<ApplicationConsole> app = new ArrayList();
        for (Applicant a : RecrutmentControler.getApplicants()) {
            for (ApplicationBand b : a.getApplicationBands()) {
                if (b.checkjobid(JobID)) {
                    app.add(b);
                }
            }
        }
        return app;
    }

}
