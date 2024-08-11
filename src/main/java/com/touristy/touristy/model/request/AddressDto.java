package com.touristy.touristy.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.touristy.touristy.model.entity.Address}
 */

public record AddressDto(String id, String street, @NotNull String city, @NotNull String state,
                         @NotNull String country) implements Serializable {
}