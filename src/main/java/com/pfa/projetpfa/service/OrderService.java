package com.pfa.projetpfa.service;

import com.pfa.projetpfa.dao.OrderRepository;
import com.pfa.projetpfa.domaine.OrderConverter;
import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService , CommandLineRunner {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<OrderVO> getOrders() {
        List<Order> list = orderRepository.findAll();
        return OrderConverter.toListVo(list);
    }

    @Override
    public OrderVO saveOrder(OrderVO order) {
        orderRepository.save(OrderConverter.toBo(order));

        return order;
    }

    @Override
    public OrderVO getOrderById(Long id) {
        boolean found = orderRepository.existsById(id);
        if (!found)
            return null;
        return OrderConverter.toVo(orderRepository.getOne(id));     }

    @Override
    public void delete(Long id) {
       orderRepository.deleteById(id);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
