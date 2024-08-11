package com.touristy.touristy.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.touristy.touristy.model.entity.Category}
 */
public record CategoryDto(String id, @NotNull String name, String description, String image) implements Serializable {
}