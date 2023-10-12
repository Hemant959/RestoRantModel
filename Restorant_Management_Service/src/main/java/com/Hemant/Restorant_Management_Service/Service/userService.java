package com.Hemant.Restorant_Management_Service.Service;

import com.Hemant.Restorant_Management_Service.model.user;
import com.Hemant.Restorant_Management_Service.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    IUserRepo iUserRepo;

    public String signUp(user newUser) {
        iUserRepo.save(newUser);
        return "credential added";
    }
}
