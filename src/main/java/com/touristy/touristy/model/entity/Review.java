package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.time.Instant;

@Entity
@Table(name = "Review", indexes = {
        @Index(name = "idx_review_id", columnList = "id")
})
public class Review implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    @Column(nullable = false)
    @NotNull
    private int stars;

    private Instant date;

    @PrePersist
    public void prePersist() {
        this.date = Instant.now();
    }
}
