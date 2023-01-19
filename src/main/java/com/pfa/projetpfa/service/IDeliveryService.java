package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.DeliveryVO;

import java.util.List;

public interface IDeliveryService {
    List<DeliveryVO> getDeliveries();
    DeliveryVO saveDelivery(DeliveryVO delivery);

    void delete(Long id);

}
