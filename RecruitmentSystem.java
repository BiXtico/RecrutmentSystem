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
      
        /*ArrayList<String> ins = new ArrayList();
        ArrayList<String> ach = new ArrayList();

       //creating random id
        /*Integer[] arr = new Integer[1000];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = i;
        }
        ins.add("SE");
        ins.add("OR");
        ach.add("cracked a vase");
        ach.add("played Apex");

        Applicant Ap = new Applicant("mahmoud",176437,"mahmoud176437@gmail.com","mahmoud176437","1234");
        Ap.setDOB("hello");
        Ap.setJobStatus("not working");
        Ap.setIntrests(ins);
        Ap.setAchivments(ach);
        Accs.add(Ap);*/
        
       RecrutmentManger db = new RecrutmentManger();

        //Insertion
      //db.addAccount(new Account(1, "Hossam","Hossam@Gmail.com","Hossam1234","eownewn0i")); //working
      //db.addAccount(new Account(2, "Arfat","Arfat@Gmail.com","Arfat1234","rouuvnofv"));  //working
      //db.addAccount(new Account(3, "manal","manal@Gmail.com","manal1234","erougnron"));  //working
       
       //deletion
      //db.deleteAccount(1);  //working
     
    //Update
    //db.updateAccount(2, "arf wahed", "wahed@gmail.com", "wahed132", "rvonerd"); // working
    
    
    /*
     ArrayList<Account> Accounts = db.getAllAccounts();
        System.out.println("Found " + Accounts.size() + " Accounts!");
        for (int i = 0; i < Accounts.size(); i++) {
            System.out.println("ID: " + Accounts.get(i).getID() + "\nName: " + Accounts.get(i).getName());
        }
*/
    
    
    

      // Employer b = new Employer("IBM",3,"manal","manal@Gmail.com","manal1234","erougnron");
      //db.addEmployer(new Employer(80,"Manar","Manar@gmail.com","manar23232","wefweer","Opa7"));
     // db.updateEmployer(4, "ioio", "email", "UserName", "Password", "CompanyName");
    }
    
}
