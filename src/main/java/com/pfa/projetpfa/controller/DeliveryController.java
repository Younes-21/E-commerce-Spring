package com.pfa.projetpfa.controller;

import com.pfa.projetpfa.domaine.DeliveryVO;
import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.IDeliveryService;
import com.pfa.projetpfa.service.IOrderService;
import com.pfa.projetpfa.service.model.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("api/delivery")
public class DeliveryController {
    @Autowired
    private IDeliveryService service;

    @GetMapping("/deliveries")
    public List<DeliveryVO> getDeliveries(){
        return service.getDeliveries();
    }

    // Save delivery
    @PostMapping("/deliveries")
    public DeliveryVO save(@RequestBody DeliveryVO delivery){
        return service.saveDelivery(delivery);
    }


}
