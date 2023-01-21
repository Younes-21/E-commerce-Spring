package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.BasketVO;

import java.util.List;

public interface IBasketService {
    List<BasketVO> getBaskets();
    BasketVO saveBasket(BasketVO basket);
    BasketVO getBasketById(Long id);
    void delete(Long id);

}
