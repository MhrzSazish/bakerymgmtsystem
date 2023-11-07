package com.project.bakerymanagementsystem.dto;

import com.project.bakerymanagementsystem.data.entity.Product;
import lombok.Data;

@Data
public class OrderItemDTO {
    private Product product;
    private int quantity;
}
