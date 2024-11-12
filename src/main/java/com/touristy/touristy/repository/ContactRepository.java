package com.touristy.touristy.repository;

import com.touristy.touristy.model.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, String> {
    void deleteById(String id);
    Contact findByEmail(String email);
    Contact findByPhone(String phone);
}