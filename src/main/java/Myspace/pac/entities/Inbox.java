
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myspace.pac.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inbox implements Serializable{
    @Id
    private Integer SenderID;
    @Id
    private Integer RecieverID;
    @Id
    private Integer msgID;

    public Inbox() {
    }

    
    
    public Inbox(Integer SenderID, Integer RecieverID, Integer msgID) {
        this.SenderID = SenderID;
        this.RecieverID = RecieverID;
        this.msgID = msgID;
    }

    
    
    public Integer getSenderID() {
        return SenderID;
    }

    public void setSenderID(Integer SenderID) {
        this.SenderID = SenderID;
    }

    public Integer getRecieverID() {
        return RecieverID;
    }

    public void setRecieverID(Integer RecieverID) {
        this.RecieverID = RecieverID;
    }

    public Integer getMsgID() {
        return msgID;
    }

    public void setMsgID(Integer msgID) {
        this.msgID = msgID;
    }
    
    
    
    
}


