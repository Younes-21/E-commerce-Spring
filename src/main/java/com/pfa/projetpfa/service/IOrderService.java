package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.model.Order;

import java.util.List;

public interface IOrderService {
    List<OrderVO> getOrders();
    void saveOrder(OrderVO order);
    OrderVO getOrderById(Long id);
    void delete (Long id);

}
