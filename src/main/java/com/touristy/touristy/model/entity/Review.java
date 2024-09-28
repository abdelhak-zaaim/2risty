package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Locked;

import java.io.Serial;
import java.time.Instant;

@Entity

public class Review implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1_23_42L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @Column(nullable = false)
    @NotNull
    private int stars;

    private Instant date;

    @PrePersist
    @Locked.Read
    public void prePersist() {
        this.date = Instant.now();
    }

}
