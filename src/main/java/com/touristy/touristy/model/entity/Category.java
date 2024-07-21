package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Entity
@Data

public class Category implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 167654674L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NotNull
    @Column(nullable = false)
    private String name;
    private String description;
    private String image;

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
