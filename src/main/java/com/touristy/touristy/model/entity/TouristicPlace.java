package com.touristy.touristy.model.entity;

import com.touristy.touristy.converters.ListImagesConverter;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Document(indexName = "touristic_places")
public class TouristicPlace implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
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

    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;

    @ManyToMany
    private List<Contact> contacts;

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
