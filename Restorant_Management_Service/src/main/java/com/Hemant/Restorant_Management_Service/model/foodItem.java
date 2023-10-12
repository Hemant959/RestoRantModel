package com.Hemant.Restorant_Management_Service.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class foodItem {
    private String title;
    private String description;
    private boolean price;
}
