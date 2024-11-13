package com.deesuntech.dreamshops.request;
import com.deesuntech.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data // Annotation that generates getters, setters, equals, hash, and toString
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
