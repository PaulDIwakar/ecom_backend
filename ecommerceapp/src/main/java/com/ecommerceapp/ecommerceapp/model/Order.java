package com.ecommerceapp.ecommerceapp.model;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "order")
@Data
public class Order {
    @Id
    private String id;
    private String username;
    private String sku;
    private String title;
    private String description;
    private String url;
    private String price;
    private String quantity;
}
