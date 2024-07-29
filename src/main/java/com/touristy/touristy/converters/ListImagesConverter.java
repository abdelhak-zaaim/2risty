package com.touristy.touristy.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.List;

@Converter
public class ListImagesConverter implements AttributeConverter<List<String>, String> {
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {

        StringBuilder images = new StringBuilder();
        for (String image : attribute) {
            if (image.contains(",")) throw new IllegalStateException("Image url shouldn't contains ','");
            images.append(image).append(",");
        }
        return images.toString();
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        return List.of(s.split(","));
    }
}
