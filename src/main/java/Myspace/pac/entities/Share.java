/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myspace.pac.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Share {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ShareID;
    private Integer UserID;
    private Integer PostID;
    private String Date;

    public Share() {
    }

    public Share(Integer ShareID, Integer UserID, Integer PostID, String Date) {
        this.ShareID = ShareID;
        this.UserID = UserID;
        this.PostID = PostID;
        this.Date = Date;
    }

    public Integer getShareID() {
        return ShareID;
    }

    public void setShareID(Integer ShareID) {
        this.ShareID = ShareID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public Integer getPostID() {
        return PostID;
    }

    public void setPostID(Integer PostID) {
        this.PostID = PostID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
    
    
}
