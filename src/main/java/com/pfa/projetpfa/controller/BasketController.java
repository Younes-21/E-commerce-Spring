package com.pfa.projetpfa.controller;


import com.pfa.projetpfa.domaine.BasketVO;
import com.pfa.projetpfa.service.BasketService;
import com.pfa.projetpfa.service.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("api/basket")
public class BasketController {
    @Autowired
    private IBasketService service;

    @GetMapping("/baskets")
    public List<BasketVO> getBaskets(){
        return service.getBaskets();
    }
}
