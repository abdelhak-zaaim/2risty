package com.touristy.touristy.converters;

import jakarta.persistence.AttributeConverter;

import java.util.List;

public class ListImagesConverter implements AttributeConverter<List<String>, String> {
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {

        StringBuilder images = new StringBuilder();
        for (String image : attribute) {
            images.append(image).append(",");
        }
        return images.toString();
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        List<String> images = List.of(s.split(","));
        return images;
    }
}
