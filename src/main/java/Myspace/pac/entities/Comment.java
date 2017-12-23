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
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer CommentID;
    private Integer UserID;
    private Integer PostID;
    private String Date;
    private String Content;

    public Comment()
    {}
    
    public Comment(Integer CommentID, Integer UserID, Integer PostID, String Date, String Content) {
        this.CommentID = CommentID;
        this.UserID = UserID;
        this.PostID = PostID;
        this.Date = Date;
        this.Content = Content;
    }

    
    
    public Integer getCommentID() {
        return CommentID;
    }

    public void setCommentID(Integer CommentID) {
        this.CommentID = CommentID;
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

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
    
    
    
    
}
