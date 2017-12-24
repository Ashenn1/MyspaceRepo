<<<<<<< HEAD
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
public class Post {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer PostID;
    private String content;
    private String Hashtag;
    private Integer LikesCount;
    private Integer CommentCount;
    private Integer SharesCount;
    private Integer UserID;
    private Integer PageID;

    public Post(Integer id, String content, String Hashtag, Integer LikesCount, Integer CommentCount, Integer SharesCount, Integer UserID, Integer PageID) {
        this.PostID= id;
        this.content = content;
        this.Hashtag = Hashtag;
        this.LikesCount = LikesCount;
        this.CommentCount = CommentCount;
        this.SharesCount = SharesCount;
        this.UserID = UserID;
        this.PageID = PageID;
    }

    public Post()
    {}
    
    public Integer getId() {
        return PostID;
    }

    public void setId(Integer id) {
        this.PostID = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHashtag() {
        return Hashtag;
    }

    public void setHashtag(String Hashtag) {
        this.Hashtag = Hashtag;
    }

    public Integer getLikesCount() {
        return LikesCount;
    }

    public void setLikesCount(Integer LikesCount) {
        this.LikesCount = LikesCount;
    }

    public Integer getCommentCount() {
        return CommentCount;
    }

    public void setCommentCount(Integer CommentCount) {
        this.CommentCount = CommentCount;
    }

    public Integer getSharesCount() {
        return SharesCount;
    }

    public void setSharesCount(Integer SharesCount) {
        this.SharesCount = SharesCount;
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
    
    
    
    
}
=======
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
public class Post {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer PostID;
    private String content;
    private String Hashtag;
    private Integer LikesCount;
    private Integer CommentCount;
    private Integer SharesCount;
    private Integer UserID;
    private Integer PageID;

    public Post(Integer id, String content, String Hashtag, Integer LikesCount, Integer CommentCount, Integer SharesCount, Integer UserID, Integer PageID) {
        this.PostID= id;
        this.content = content;
        this.Hashtag = Hashtag;
        this.LikesCount = LikesCount;
        this.CommentCount = CommentCount;
        this.SharesCount = SharesCount;
        this.UserID = UserID;
        this.PageID = PageID;
    }

    public Post()
    {}
    
    public Integer getId() {
        return PostID;
    }

    public void setId(Integer id) {
        this.PostID = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHashtag() {
        return Hashtag;
    }

    public void setHashtag(String Hashtag) {
        this.Hashtag = Hashtag;
    }

    public Integer getLikesCount() {
        return LikesCount;
    }

    public void setLikesCount(Integer LikesCount) {
        this.LikesCount = LikesCount;
    }

    public Integer getCommentCount() {
        return CommentCount;
    }

    public void setCommentCount(Integer CommentCount) {
        this.CommentCount = CommentCount;
    }

    public Integer getSharesCount() {
        return SharesCount;
    }

    public void setSharesCount(Integer SharesCount) {
        this.SharesCount = SharesCount;
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
    
    
    
    
}
>>>>>>> origin/master
