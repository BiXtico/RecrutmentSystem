package recruitmentsystem;

public class Admin extends Account {

    //please Edit admin
    private static final Admin admin = new Admin(1, "Amr", "amr173800@bue", "Amr173800", "A12345");

    private Admin(int id, String name, String email, String username, String password) {
        super(id, name, email, username, password);

    }

    public void BanUser(Account acc) {
        acc.setBanned(true);
    }

    public void validatevacencies() {       //take Job object as parameter

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
    public String Search(String s) {
        return "not allowed";
    }

} 
