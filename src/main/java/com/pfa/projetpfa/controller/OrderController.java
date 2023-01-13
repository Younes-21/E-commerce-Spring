package com.pfa.projetpfa.controller;


import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private IOrderService service;
    @GetMapping("/orders")
    public List<OrderVO> getBaskets(){
        return service.getOrders();
    }

}
