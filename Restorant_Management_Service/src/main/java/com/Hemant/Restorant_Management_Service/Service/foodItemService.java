package com.Hemant.Restorant_Management_Service.Service;

import com.Hemant.Restorant_Management_Service.repo.IFoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class foodItemService {
    @Autowired
    IFoodItem iFoodItem;
}
