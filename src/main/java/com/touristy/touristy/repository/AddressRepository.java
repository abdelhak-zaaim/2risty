package com.touristy.touristy.repository;

import com.touristy.touristy.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}