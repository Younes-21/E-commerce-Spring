package com.pfa.projetpfa.dao;

import com.pfa.projetpfa.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
