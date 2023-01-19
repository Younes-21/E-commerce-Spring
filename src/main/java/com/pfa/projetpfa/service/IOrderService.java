package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.OrderVO;

import java.util.List;

public interface IOrderService {
    List<OrderVO> getOrders();
    OrderVO saveOrder(OrderVO order);
    OrderVO getOrderById(Long id);
    void delete (Long id);

}
