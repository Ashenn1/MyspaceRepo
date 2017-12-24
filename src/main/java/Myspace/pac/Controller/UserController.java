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
        System.out.print(user.getFirstName() + user.getLastName());
        Userrepo.save(user);
        model.addAttribute("user",new User());
        return "signup";
     }
     
     @GetMapping("/signin")
    public String showsignInform(Model model)
    {
       model.addAttribute("user",new User());
       return "signin";
    }
    
    
    @PostMapping("/signin")
     public String signin(Model model, @ModelAttribute User user)
     {
        System.out.print(user.getEmail() + user.getPassword() + user.getUserID());
        Iterable<User> userIterable = Userrepo.findAll();
        ArrayList<User> list = new ArrayList();
        for(User userDummy : userIterable) {
            //list.add(userDummy);
            if(user.getUserID() == userDummy.getUserID()){
               System.out.print("useer is found");
               break;
            }
            else
                System.out.print("user is not found or you've entered something wrong");
        }
        model.addAttribute("user",new User());
        if(Userrepo.exists(user.getUserID())){
            System.out.print("user is found");
        }
        return "signin";
     }
}
