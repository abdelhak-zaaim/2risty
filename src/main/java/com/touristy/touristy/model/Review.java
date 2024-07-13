package com.touristy.touristy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;
import java.time.LocalDate;

@Document(indexName = "reviews")
public class Review implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 16765455674L;
   @Id
   private String id;
    private String comment;
    private int stars;

    private LocalDate date;

    private String placeId;


}
