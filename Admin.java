/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

public class Admin extends Account {
    //please Edit admin
    private static final Admin admin = new Admin(1, "Amr", "amr173800@bue", "Amr173800", "A12345");

    private Admin(int id, String name, String email, String username, String password) {
        super(name, id, email, username, password);

        SearchObj = new SearchJobTitle();
    }

    public void BanUser(Account acc) {
        acc.setBanned(true);
    }

    public void validatevacencies() {       //take Job object as parameter

    }

    public void EditProfile(String name, String mail) {
        this.name = name;
        this.email = mail;
    }

    public void DisplayUser(Account acc) {
        System.out.println("ID: " + acc.getID() + "\nName: " + acc.getName()
                + "\nEmail: " + acc.getEmail() + "\nUsername: " + acc.getUsername()
                + "\nPassword: " + acc.getPassword());
    }

    public static Admin getobj() {
        return admin;
    }

    @Override
    public void Search(String s) {
        //do nothing
    }

}
