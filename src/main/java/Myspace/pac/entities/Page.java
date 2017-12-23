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
public class Page {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer PageID;
    private String Description;

    public Page() {
    }

    public Page(Integer PageID, String Description) {
        this.PageID = PageID;
        this.Description = Description;
    }

    public Integer getPageID() {
        return PageID;
    }

    public void setPageID(Integer PageID) {
        this.PageID = PageID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
    
}
