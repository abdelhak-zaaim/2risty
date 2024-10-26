package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.time.Instant;

@Entity
public class Review implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 125_276_42;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 1000)
    private String comment;

    @Column(nullable = false)
    @NotNull
    @Min(value = 1)
    @Max(value = 5)
    private int stars;

    @Column(nullable = false)
    private Instant date;

    @PrePersist
    public void prePersist() {
        this.date = Instant.now();
    }

}
