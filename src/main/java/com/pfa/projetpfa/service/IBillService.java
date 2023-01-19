package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.BillVO;

import java.util.List;

public interface IBillService {
    List<BillVO> getBills();
    BillVO saveBill(BillVO bill);
    void delete(Long id);
}
