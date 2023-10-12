package com.Hemant.Restorant_Management_Service.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    private String userName;
    private String userPassword;
    private String userEmail;
}
