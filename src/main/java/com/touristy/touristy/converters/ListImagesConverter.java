package com.touristy.touristy.converters;

import jakarta.persistence.AttributeConverter;

import java.util.List;

public class ListImagesConverter implements AttributeConverter<List<String>, String> {
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
       // List<String> to String
       String images = "";
       for (String image : attribute) {
          images += image + ",";
       }
       return images;
    }

   @Override
   public List<String> convertToEntityAttribute(String s) {
       List<String> images = List.of(s.split(","));
      return images;
   }
}
