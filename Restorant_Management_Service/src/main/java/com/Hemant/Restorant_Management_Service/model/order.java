package com.Hemant.Restorant_Management_Service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private Integer orderId;
    private Integer foodItemId;
    private Integer quantity;
    private Integer userId;

}
