package com.touristy.touristy.repository;

import com.touristy.touristy.model.entity.Contact;
import com.touristy.touristy.model.entity.TouristicPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristyPlaceRepository extends JpaRepository<TouristicPlace, String> {
}
