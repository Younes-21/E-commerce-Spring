package com.pfa.projetpfa.dao;

import com.pfa.projetpfa.service.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery , Long> {
}
