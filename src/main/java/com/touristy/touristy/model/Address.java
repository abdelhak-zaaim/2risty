package com.touristy.touristy.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;

@Document(
        indexName = "addresses"
)
public class Address implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1674674L;
    @Id
    private String id;
    private String street;
    private String city;
    private String state;
    private String country;
}
