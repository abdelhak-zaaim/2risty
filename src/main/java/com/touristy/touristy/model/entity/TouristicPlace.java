package com.touristy.touristy.model.entity;

import com.touristy.touristy.converters.ListImagesConverter;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;
import java.time.Instant;
import java.util.List;

@Document(indexName = "touristic_places")
public class TouristicPlace implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 17666576L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;
    private String location;

    @ManyToOne
    private Category category;

    @Convert(converter = ListImagesConverter.class)
    private List<String> images;

    private String video;
    private String latitude;
    private String longitude;

    private Instant createdAt;
    private Instant updatedAt;

    @ManyToMany
    private List<Contact> contacts;

    @PrePersist
    public void prePersist() {
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = Instant.now();
    }
}
