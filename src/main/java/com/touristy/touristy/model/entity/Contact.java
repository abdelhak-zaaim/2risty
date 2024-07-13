package com.touristy.touristy.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;

@Entity
@Data
public class Contact implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 164574674L;
    @Id
    private String id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    private String phone;
}
