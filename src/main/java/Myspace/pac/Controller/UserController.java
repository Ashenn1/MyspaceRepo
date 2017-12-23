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


@Controller
public class UserController {
    @Autowired
    private UserRepository Userrepo ;
    
    
    
    
    @GetMapping("/signup")
    public String showform(Model model)
    {
       model.addAttribute("user",new User());
       return "signup";
    }
    
    @PostMapping("/signup")
     public String signup(Model model , @ModelAttribute User user )
     {
        System.out.print(user.getFirstName() + user.getLastName() + user.getEmail() +user.getPassword());
        //Userrepo.save(user);
        model.addAttribute("user",new User());
        return "signup";
     }
    
    
}
