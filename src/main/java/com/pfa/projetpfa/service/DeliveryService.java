package com.pfa.projetpfa.service;

import com.pfa.projetpfa.dao.DeliveryRepository;
import com.pfa.projetpfa.domaine.DeliveryConverter;
import com.pfa.projetpfa.domaine.DeliveryVO;
import com.pfa.projetpfa.service.model.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService implements IDeliveryService , CommandLineRunner {
    @Autowired
    private DeliveryRepository deliveryRepository;
    @Override
    public List<DeliveryVO> getDeliveries() {
        List<Delivery> list = deliveryRepository.findAll();
        return DeliveryConverter.toListVo(list);
    }

    @Override
    public DeliveryVO saveDelivery(DeliveryVO delivery) {
        deliveryRepository.save(DeliveryConverter.toBo(delivery));
        return delivery;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
