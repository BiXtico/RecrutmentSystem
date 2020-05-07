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
public class Account {

    String name;
    private int ID;
    private String email;
    private String username;
    private String password;
    private boolean Banned;
    private ArrayList<Message> Messages = new ArrayList();
    public SearchStrategy SearchObj;

    public void Search(String s){};

    public Account(String name, int ID, String email, String username, String password) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Banned = false;
    }

    public ArrayList<Message> getMessages() {
        return Messages;
    }

    public void setMessages(ArrayList<Message> Messages) {
        this.Messages = Messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SearchStrategy getSearchObj() {
        return SearchObj;
    }

    public void setSearchObj(SearchStrategy SearchObj) {
        this.SearchObj = SearchObj;
    }

    public boolean isBanned() {
        return Banned;
    }

    public void setBanned(boolean Banned) {
        this.Banned = Banned;
    }

    public void EditProfile() {
        String Aname = "", Aemail = "", Ausername = "", Apassword = "";
        if (Aname.isEmpty() == false) {
            this.setUsername(username);
        }
        if (Aemail.isEmpty() == false) {
            this.setEmail(Aemail);
        }
        if (Ausername.isEmpty() == false) {
            this.setUsername(Ausername);
        }
        if (Apassword.isEmpty() == false) {
            this.setPassword(Apassword);
        }
        System.out.println("AccountUpdated");
    }
}
