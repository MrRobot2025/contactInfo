package com.spring.test.ContactInfo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "categories")
public class Category {

    @Id
    private String id;
    private String Category;

}
