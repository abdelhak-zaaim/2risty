package com.touristy.touristy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;
import java.util.List;

@Document(indexName = "touristic_places")
public class TouristicPlace implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 16457654674L;
    @Id
    private String id;
    private String name;
    private String description;
    private String location;
    private Category category;
    private List<String> images;
    private String video;
    private String latitude;
    private String longitude;

    private Review reviews;


}
