package com.touristy.touristy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;

@Document(indexName = "contacts")
public class Contact implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 164574674L;
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
