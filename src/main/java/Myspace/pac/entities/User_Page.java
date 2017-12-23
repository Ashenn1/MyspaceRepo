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
public class User_Page implements Serializable {
    
    @Id
    private Integer UserID;
    @Id
    private Integer PageID;
    private Integer AdminID;
    private Integer UserCount;

    public User_Page() {
    }

    public User_Page(Integer UserID, Integer PageID, Integer AdminID, Integer UserCount) {
        this.UserID = UserID;
        this.PageID = PageID;
        this.AdminID = AdminID;
        this.UserCount = UserCount;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public Integer getPageID() {
        return PageID;
    }

    public void setPageID(Integer PageID) {
        this.PageID = PageID;
    }

    public Integer getAdminID() {
        return AdminID;
    }

    public void setAdminID(Integer AdminID) {
        this.AdminID = AdminID;
    }

    public Integer getUserCount() {
        return UserCount;
    }

    public void setUserCount(Integer UserCount) {
        this.UserCount = UserCount;
    }
    
    
}
