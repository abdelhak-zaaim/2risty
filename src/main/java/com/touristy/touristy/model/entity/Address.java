package com.touristy.touristy.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Address implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1674674L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String street;
    @NotNull
    @Column(nullable = false)
    private String city;
    @NotNull
    @Column(nullable = false)
    private String state;
    @NotNull
    @Column(nullable = false)
    private String country;

    private LocalDate createdAt;
    private LocalDate updatedAt;


    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDate.now();
    }
}
