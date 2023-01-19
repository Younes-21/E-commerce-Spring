package com.pfa.projetpfa.service;

import com.pfa.projetpfa.dao.BillRepository;
import com.pfa.projetpfa.domaine.BillConverter;
import com.pfa.projetpfa.domaine.BillVO;
import com.pfa.projetpfa.service.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements IBillService, CommandLineRunner {
   @Autowired
   private BillRepository billRepository;
    @Override
    public List<BillVO> getBills() {
        List<Bill> list = billRepository.findAll();
        return BillConverter.toListVo(list);     }

    @Override
    public BillVO saveBill(BillVO bill) {
        billRepository.save(BillConverter.toBo(bill));
        return bill;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
