package com.pfa.projetpfa.controller;


import com.pfa.projetpfa.domaine.BasketVO;
import com.pfa.projetpfa.domaine.CategoryVO;
import com.pfa.projetpfa.service.BasketService;
import com.pfa.projetpfa.service.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value="/baskets")
    public BasketVO save(@RequestBody BasketVO basket){
        return service.saveBasket(basket);
    }

    @GetMapping(value = "/baskets/{id}")
    public ResponseEntity<Object> getBasketById(@PathVariable(value = "id") Long basketVoId)
    {
        BasketVO basketVoFound = service.getBasketById(basketVoId);
        if (basketVoFound == null)
            return new ResponseEntity<>("Basket doen't exist", HttpStatus.OK);
        return new ResponseEntity<>(basketVoFound, HttpStatus.OK);
    }

    @PutMapping(value = "/baskets/{id}")
    public ResponseEntity<Object> updateBasket(@PathVariable(name = "id") Long basketVoId, @RequestBody BasketVO basketVo) {
        BasketVO basketVoFound = service.getBasketById(basketVoId);
        if (basketVoFound == null)
            return new ResponseEntity<>("basket doen't exist", HttpStatus.OK);
        basketVo.setId(basketVoId);
        service.saveBasket(basketVo);
        return new ResponseEntity<>("Basket is updated successsfully",HttpStatus.OK);
    }


}
