package com.touristy.touristy.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;

@Entity
@Data

public class Category implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 167654674L;
    @Id
    private String id;
    private String name;
    private String description;
    private String image;


}
