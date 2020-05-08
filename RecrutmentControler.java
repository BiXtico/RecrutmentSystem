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
public class RecrutmentControler {
   private static RecrutmentManger manger = new RecrutmentManger();
   private static RecrutmentControler RC = new RecrutmentControler();
   private static ArrayList<Applicant> Applicants = new ArrayList();
   private static ArrayList<Employer> Employers = new ArrayList();

   RecrutmentControler(){};

    public static RecrutmentManger getManger() {
        return manger;
    }

    public static void setManger(RecrutmentManger manger) {
        RecrutmentControler.manger = manger;
    }

    public static ArrayList<Applicant> getApplicants() {
        return Applicants;
    }

    public static void setApplicants(ArrayList<Applicant> Applicants) {
        RecrutmentControler.Applicants = Applicants;
    }

    public static ArrayList<Employer> getEmployers() {
        return Employers;
    }

    public static void setEmployers(ArrayList<Employer> Employers) {
        RecrutmentControler.Employers = Employers;
    }

    public static RecrutmentControler getRC() {
        return RC;
    }

    public static void setRC(RecrutmentControler RC) {
        RecrutmentControler.RC = RC;
    }
   
   
   
   
}
