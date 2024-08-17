package com.touristy.touristy.service;


import com.touristy.touristy.model.entity.Address;
import com.touristy.touristy.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Optional<Address> findAddressById(String id) {
        return addressRepository.findById(id);
    }

    public void deleteAddressById(String id) {
        addressRepository.deleteById(id);
    }

    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }
}
