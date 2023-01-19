package com.pfa.projetpfa.controller;


import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.IOrderService;
import com.pfa.projetpfa.service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private IOrderService service;
    @GetMapping("/orders")
    public List<OrderVO> getOrders(){
        return service.getOrders();
    }

    // Save order
    @PostMapping("/orders")
    public OrderVO save(@RequestBody OrderVO order){
        return service.saveOrder(order);
    }
}
