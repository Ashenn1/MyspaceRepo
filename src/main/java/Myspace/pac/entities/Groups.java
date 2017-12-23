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
public class Groups {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Groupid;
    private Integer UserCount;

    public Groups() {
    }

    
    
    public Groups(Integer Groupid, Integer UserCount) {
        this.Groupid = Groupid;
        this.UserCount = UserCount;
    }
    
    
    public Integer getGroupid() {
        return Groupid;
    }

    public void setGroupid(Integer Groupid) {
        this.Groupid = Groupid;
    }

    public Integer getUserCount() {
        return UserCount;
    }

    public void setUserCount(Integer UserCount) {
        this.UserCount = UserCount;
    }
    
    
    
}
