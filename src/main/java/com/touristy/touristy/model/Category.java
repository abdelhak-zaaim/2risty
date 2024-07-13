package com.touristy.touristy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;

@Document(indexName = "categories")

public class Category implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 167654674L;
   @Id
    private String id;
    private String name;
    private String description;
    private String image;


}
