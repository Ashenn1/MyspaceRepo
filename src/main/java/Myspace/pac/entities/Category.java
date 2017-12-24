
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
public class Category implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer tagID;
    @Id
    private Integer PostID;

    public Category() {
    }

    
    
    public Category(Integer tagID, Integer PostID) {
        this.tagID = tagID;
        this.PostID = PostID;
    }

    
    
    public Integer getTagID() {
        return tagID;
    }

    public void setTagID(Integer tagID) {
        this.tagID = tagID;
    }

    public Integer getPostID() {
        return PostID;
    }

    public void setPostID(Integer PostID) {
        this.PostID = PostID;
    }
    
    
    
    
}
