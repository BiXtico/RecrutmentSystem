/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mahmo
 */
public class RecrutmentManger {
     private final String userName = "root";
    private final String password = "";
    private final String dbName = "perfectrecruit";

    private Connection con;
/*
    public RecrutmentManger() {
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Get a connection to database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfectrecruit", userName, password);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
    }
    
   public void addAccount(Account s) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into account values("+s.getID()+",'"+ s.getName()+"','"+s.getEmail()+ "','"+s.getUsername()+"' ,'"+s.getPassword()+"')");
            System.out.println("Account added");
        } catch (SQLException e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
  
       public void deleteAccount(int id) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from account where id = " + id + "");
            System.out.println("Account deleted");
        } catch (SQLException e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }
  
    public void updateAccount(int id, String name,String email,String UserName, String Password) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update account set name = '" +name+ "', email ='"+email+"' , username ='"+UserName+"' , password = '"+Password+"' where id = " + id + "");
            System.out.println("Account updated");
        } catch (SQLException e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }

    
    
    public Account getAccountByID(int ID) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from account where id = " + ID+ "");
            if (rs.first()) {
                return new Account(rs.getInt("id"), rs.getString("name"),rs.getString("email") ,rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return null;
    }
   
    public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> result = new ArrayList();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from account");
            while (rs.next()) {
                result.add(new Account(rs.getInt("id"), rs.getString("name"),rs.getString("email") ,rs.getString("username"), rs.getString("password")));
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }
    
    
    public void addEmployer(Employer s) {
        try {
            Statement stmt = con.createStatement();
              stmt.executeUpdate("insert into account values("+s.getID()+",'"+ s.getName()+"','"+s.getEmail()+ "','"+s.getUsername()+"' ,'"+s.getPassword()+"')");
            stmt.executeUpdate("insert into employer values("+s.getID()+",'"+s.getCompanyName()+"')");
            System.out.println("Employer added");
        } catch (SQLException e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
  
       public void deleteEmployer(int id) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from job where employerid = " + id + "");
            stmt.executeUpdate("delete from account where id = " + id + "");
            stmt.executeUpdate("delete from employer where id = " + id + "");
            System.out.println("Employer deleted");
        } catch (SQLException e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }
  
    public void updateEmployer(int id, String name,String email,String UserName, String Password,String CompanyName) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update account set name = '" +name+ "', email ='"+email+"' , username ='"+UserName+"' , password = '"+Password+"' where id = " + id + "");
            stmt.executeUpdate("update employer set company = '"+CompanyName+"'  where id = " + id + "");
            System.out.println("Employer Updated");
        } catch (SQLException e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }
    
        public ArrayList<Employer> getAllEmployer() {
        ArrayList<Employer> result = new ArrayList();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select account.id,account.name,account.email,account.username,account.password,employer.company from account,employer Where account.id=employer.id");
            while (rs.next()) {
                result.add(new Employer(rs.getInt("id"), rs.getString("name"),rs.getString("email") ,rs.getString("username"), rs.getString("password"), rs.getString("company")));
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }
        
        
          public void addApplicant(Applicant s) {
     try {
            Statement stmt = con.createStatement();
              stmt.executeUpdate("insert into account values("+s.getID()+",'"+ s.getName()+"','"+s.getEmail()+ "','"+s.getUsername()+"' ,'"+s.getPassword()+"')");
            stmt.executeUpdate("insert into applicant values("+s.getID()+",'"+s.getDOB()+"','"+s.getJobStatus()+"','"+s.getAddress()+"')");
            System.out.println("Applicant added");
        } catch (SQLException e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
      
       public void deleteApplicant(int id) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from account where id = " + id + "");
            stmt.executeUpdate("delete from applicant where id = " + id + "");
            System.out.println("Applicant deleted");
        } catch (SQLException e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }
   
    public void updateApplicant(int id, String name,String email,String UserName, String Password,String DOB,String JobStatus,String Address) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update account set name = '" +name+ "', email ='"+email+"' , username ='"+UserName+"' , password = '"+Password+"' where id = " + id + "");
            stmt.executeUpdate("update applicant set DOB = '"+DOB+"', address = '"+Address+"',jobstatus='"+JobStatus+"'  where id = " + id + "");
            System.out.println("Applicant Updated");
        } catch (SQLException e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }
    
        public ArrayList<Applicant> getAllApplicants() {
        ArrayList<Applicant> result = new ArrayList();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select account.id,name,email,username,password,DOB,jobstatus,address from account,applicant Where account.id=applicant.id");
            while (rs.next()) {
                result.add(new Applicant(rs.getInt("id"), rs.getString("name"),rs.getString("email") ,rs.getString("username"), rs.getString("password"), rs.getString("DOB"),rs.getString("jobstatus"),rs.getString("address")));
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }
        
            public Account getAdmin() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from account,admin where account.id = admin.id ");
            if (rs.first()) {
                return new Account(rs.getInt("id"), rs.getString("name"),rs.getString("email") ,rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return null;
    }
            
               public void addJob(Job s) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO job(id,title,description,salary,workinghours,jobcategory,NAP,experianceneeded,careerlevel,employerid) VALUES ("+s.getJobID()+",'"+s.getTitle()+"','"+s.getDescription()+"',"+ s.getSalary()+","+s.getNumberOfAvilablePositions()+",'"+s.getJobCategory()+"',"+s.getNumberOfAvilablePositions()+","+s.getExprienceNeeded()+",'"+s.getCareerLevel()+"',"+s.getEmpID()+")");
          //stmt.executeUpdate("insert into job values('"+s.getTitle()+"','"+s.getDescription()+"',"+ s.getSalary()+","+s.getWorkingHours()+" ,'"+s.getJobCategory()+"',"+s.getNumberOfAvilablePositions()+","+s.getExprienceNeeded()+",'"+s.getCareerLevel()+"',"+s.getJobID()+")");
            System.out.println("Job added");
        } catch (SQLException e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
            

           public void deleteJob(int id) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from job where id = " + id + "");
            System.out.println("Job deleted");
        } catch (SQLException e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }
    
             public ArrayList<Job> getAllJobs() {
        ArrayList<Job> result = new ArrayList();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from job");
            while (rs.next()) {
                result.add(new Job(rs.getInt("id"), rs.getString("title"),rs.getString("description") ,rs.getFloat("salary"), rs.getInt("workinghours"),rs.getString("jobcategory"),rs.getInt("NAP"),rs.getInt("experianceneeded"),rs.getString("careerlevel"),rs.getInt("employerid")));
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }*/
}
