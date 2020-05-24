package com.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class UserController {
    @RequestMapping("/getUser")
    public ArrayList getUsersInfo()
    {
        ArrayList<User> userArrayList=new ArrayList<>();
        User u=new User(1,"Sachi","Software engineer");
        User u2=new User(2,"Arnav","Software engineer");
        User u3=new User(3,"sourav","Software engineer");
        userArrayList.add(u);
        userArrayList.add(u2);
        userArrayList.add(u3);
        return userArrayList;

    }

}
