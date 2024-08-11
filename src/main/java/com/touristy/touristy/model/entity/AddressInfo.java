package com.touristy.touristy.model.entity;

/**
 * Projection for {@link Address}
 */
public interface AddressInfo {
    String getId();

    String getStreet();

    String getCity();

    String getState();
}