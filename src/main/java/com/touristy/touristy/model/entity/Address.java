package com.touristy.touristy.model.entity;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;

@Entity
@Data
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
