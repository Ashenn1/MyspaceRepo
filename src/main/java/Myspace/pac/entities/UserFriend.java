/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myspace.pac.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserFriend implements Serializable {
    
    @Id
    private Integer UserID;
    @Id
    private Integer FriendID;

    public UserFriend() {
    }

    public UserFriend(Integer UserID, Integer FriendID) {
        this.UserID = UserID;
        this.FriendID = FriendID;
    }
    
    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public Integer getFriendID() {
        return FriendID;
    }

    public void setFriendID(Integer FriendID) {
        this.FriendID = FriendID;
    }
    
}
