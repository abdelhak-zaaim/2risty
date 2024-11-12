package com.touristy.touristy.repository;

import com.touristy.touristy.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, String> {
    Address findByCity(String city);
    Address findByStreet(String street);
    Address findByState(String state);
    Address findByCountry(String country);
    Optional<Address> findById(String id);

}