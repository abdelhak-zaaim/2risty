package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.apache.catalina.User;

import java.io.Serial;
import java.lang.reflect.Type;
import java.time.Instant;

@Entity
public class Review implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 12_23_42L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 1000, message = "Comment must not exceed 1000 characters")
    private String comment;

    @Column(nullable = false)
    @NotNull
    @Min(value = 1, message = "Stars must be at least 1")
    @Max(value = 5)
    private int stars;

    @Column(nullable = false)
    private Instant date;




    @PrePersist
    public void prePersist() {
        this.date = Instant.now();
    }

    // Getters and setters

    // toString, equals, and hashCode methods
}