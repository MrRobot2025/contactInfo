package com.spring.test.ContactInfo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "customerQuery")
public class CustomerQuery {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String category;
    private String phoneNumber;
    private String emailId;
    private String state;
    private String city;
    private String message;
    private String status;

}
