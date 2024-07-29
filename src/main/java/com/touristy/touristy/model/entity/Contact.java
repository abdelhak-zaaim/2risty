package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Entity
@Data
public class Contact implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    private String phone;

    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;


    @PrePersist
    public void prePersist() {
        this.createdAt = ZonedDateTime.now(ZoneId.systemDefault());
        this.updatedAt = ZonedDateTime.now(ZoneId.systemDefault());
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = ZonedDateTime.now(ZoneId.systemDefault());
    }
}
