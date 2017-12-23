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
public class User_Group implements Serializable {
    @Id
    private Integer GroupID;
    @Id
    private Integer UserID;

    public User_Group() {
    }

    public User_Group(Integer GroupID, Integer UserID) {
        this.GroupID = GroupID;
        this.UserID = UserID;
    }

    public Integer getGroupID() {
        return GroupID;
    }

    public void setGroupID(Integer GroupID) {
        this.GroupID = GroupID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }
    
    
}
