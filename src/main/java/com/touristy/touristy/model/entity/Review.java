package com.touristy.touristy.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.time.LocalDate;

@Entity
public class Review implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 16765455674L;
    @Id
    private Long id;
    private String comment;
    @Column(nullable = false) @NotNull
    private int stars;

    private LocalDate date;

    @PrePersist
    public void prePersist() {
        this.date = LocalDate.now();
    }
}
