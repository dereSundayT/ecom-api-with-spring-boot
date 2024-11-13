package com.deesuntech.dreamshops.dto;



import com.deesuntech.dreamshops.model.Category;
import com.deesuntech.dreamshops.model.Image;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    private List<ImageDto> images;
}