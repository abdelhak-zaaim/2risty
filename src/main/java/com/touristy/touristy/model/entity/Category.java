package com.touristy.touristy.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;

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


}
