package web.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.models.User;
import web.service.UserService;
import web.service.UserServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String printUsers(ModelMap model){
        UserService us = new UserServiceImp();
        us.createUser("Andy",25);
        List<User> messages = us.getAllUser();
        model.addAttribute("messages", messages);
        return "users";
    }
//    @GetMapping(/createuser)
//    public String createUserWeb (ModelMap model, HttpServletRequest request){
//        UserService us = new UserServiceImp();
//    }


    
}
