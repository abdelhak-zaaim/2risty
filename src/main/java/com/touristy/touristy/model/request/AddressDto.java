package com.touristy.touristy.model.request;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public record AddressDto(String id, String street, @NotNull String city, @NotNull String state,
                         @NotNull String country) implements Serializable {
}