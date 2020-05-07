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
    private String Senderinfo;
     private String Recieverinfo;

    public Message(int ID, String Content, String Senderinfo, String Recieverinfo) {
        this.ID = ID;
        this.Content = Content;
        this.Senderinfo = Senderinfo;
        this.Recieverinfo = Recieverinfo;
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
    
    public String getSenderinfo() {
        return Senderinfo;
    }

    public void setSenderinfo(String Senderinfo) {
        this.Senderinfo = Senderinfo;
    }

    public String getRecieverinfo() {
        return Recieverinfo;
    }

    public void setRecieverinfo(String Recieverinfo) {
        this.Recieverinfo = Recieverinfo;
    }
    

}
