package com.Hemant.Restorant_Management_Service.Controller;

import com.Hemant.Restorant_Management_Service.Service.userService;
import com.Hemant.Restorant_Management_Service.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @Autowired
    userService userService;
    @PostMapping("api/user/sign-up")
        public String signUp(@RequestBody user newUser){
            return userService.signUp(newUser);
        }
}
