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
public class RecruitmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        RecrutmentManger db = new RecrutmentManger(); 
      Applicant n = new Applicant(176437,"Mahmoud","mahmoud176437@gmail.com","Mahmoud176437","176437","4/4","Employed","Faraskour");
      
      n.applyToJob(2, false, 3, "i want to join", 2, 6, "humngous", "this is a band");
      
      n.getApplicationBands().get(0).DisplayApp();

        //Insertion
     //  db.addAccount(new Account("Hossam","Hossam@Gmail.com","Hossam1234","eownewn0i")); //working
     //  db.addAccount(new Account(2, "Arfat","Arfat@Gmail.com","Arfat1234","rouuvnofv"));  //working
      // db.addAccount(new Account(3, "manal","manal@Gmail.com","manal1234","erougnron"));  //working
        //db.addAccount(new Account(90, "manal","manal@Gmail.com","manal1234","erougnron"));
       //deletion
   //  db.deleteAccount(8);  //working
     
    //Update
    //db.updateAccount(2, "arf wahed", "wahed@gmail.com", "wahed132", "rvonerd"); // working
    /*
     ArrayList<Account> Accounts = db.getAllAccounts();
        System.out.println("Found " + Accounts.size() + " Accounts!");
        for (int i = 0; i < Accounts.size(); i++) {
            System.out.println("ID: " + Accounts.get(i).getID() + "\nName: " + Accounts.get(i).getName());
        }
*/
    
    
    

      // db.deleteEmployer(4);
 //   db.addEmployer(new Employer(80,"Manar","Manar@gmail.com","manar23232","wefweer","Opa7"));
  //  db.addEmployer(new Employer(10,"Manar","Manar@gmail.com","manar23232","wefweer","Opa7"));
  //   db.addEmployer(new Employer(90,"Manar","Manar@gmail.com","manar23232","wefweer","Opa7"));
      
     // db.updateEmployer(4, "ignb", "email", "UserName", "Password", "iugbo");
     
     
    // ArrayList<Employer> b = db.getAllEmployer();
       
  // db.addApplicant(new Applicant(909,"ignb", "email", "UserName", "Password","17/7/2001","Non Employed","Share3 el mo3z"));
  //  db.addApplicant(new Applicant(98,"ignb", "email", "UserName", "Password","17/7/2001","Non Employed","Share3 el mo3z"));
  //  db.addApplicant(new Applicant(99,"ignb", "email", "UserName", "Password","17/7/2001","Non Employed","Share3 el mo3z"));
       
   
 //  db.deleteApplicant(99);
   
 //  db.updateApplicant(9, "sdvsd", "wefwef", "gwrbbr", "rvwrvr","20/7/2001"," Employed","Share3 ");
 
 
//  ArrayList<Applicant> Applicants= db.getAllApplicants();
   //System.out.print(Applicants.size());
  
  // System.out.print(db.getAdmin().getName());
  
 //db.addJob(new Job(4,"Cook","You Cook Things",4000,8,"Catering",13,4,"Advanced",4));
  //Job(String title, String description, float salary, int workingHours, String JobCategory, int NumberOfAvilablePositions, int ExprienceNeeded, String CareerLevel, int JobID, int EmpID)
  //(id,title,description,salary,workinghours,jobcategory,NAP,experianceneeded,careerlevel,employerid)
  
 // db.deleteJob(3);
 // db.deleteJob(9);
  
//  ArrayList<Job> f = db.getAllJobs();
//  System.out.print("There are " +f.size()+ " Available");
  
  
//  db.updateJob(4,"cleaning","You clean Things",3000,6,"Hotels",14,8,"begginer",3);
  
 // db.addAchievment("asdasdasd", 4);
 
 
 //ArrayList<String> f = db.getAllAchievments();
 // System.out.print(f.size());
  
 //db.deleteAchievment(1);

 
 //ArrayList<Job> g =db.getAllJobOffers(12);
//System.out.print(g.size());


//db.addIntrest("edewfwefwef", 5);





/*
ArrayList<Applicant> Applicants= db.getAllApplicants();
ArrayList<Integer>IntrestedInCooking = db.getIntristedPeople("cooking");
ArrayList<Applicant> Intriste = new ArrayList<Applicant>();
for(int i=0;i<IntrestedInCooking.size();i++){
    Intriste.add( db.getApplicantByID(IntrestedInCooking.get(i)));
*/
//System.out.print(Intriste.get(0).getName());



//Applicant r = db.getApplicantByID(99);


  

//db.SendMessage(new Message("this is SPARTAAAAAAAAAAAAAAA","Opa7","UserName"));

/*
     ArrayList<Message> Message = db.getAllMessages();
     
     for(int y=0;y<Message.size();y++){
         System.out.print(Message.get(y).getID()+"  ");
         System.out.print(Message.get(y).getEmployerInfo()+"  ");
         System.out.print(Message.get(y).getApplicantInfo()+"  ");
         System.out.println(Message.get(y).getContent());

      
     }
 
  */    
    }
    
}
