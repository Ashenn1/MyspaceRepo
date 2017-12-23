package Myspace.pac.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   private Integer UserID;
   private String UserName;
   private String FirstName;
   private String LastName;
   private String password;
   private String DateOfBirth;
   private String Gender;
   private String Email;
    
    public User()
{
    UserID=0;
    UserName="";
    FirstName="";
    LastName="";
    password="";
    DateOfBirth="";
    Gender="";
    Email="";

}

    public User(Integer UserID, String UserName, String FirstName, String LastName, String DateOfBirth, String Gender, String Email,String password) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Email = Email;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
   
}