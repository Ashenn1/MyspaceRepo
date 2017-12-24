/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myspace.pac.Controller;

import Myspace.pac.Repository.UserRepository;
import Myspace.pac.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.io.*;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;

public class profileController {
    @Autowired
    private UserRepository Userrepo ;
    
    @RequestMapping("/profile")
    public String Redirect(User user){
        
        return"/profile";
    }
}
