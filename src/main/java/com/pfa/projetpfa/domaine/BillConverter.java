package com.pfa.projetpfa.domaine;

import com.pfa.projetpfa.service.model.Bill;
import com.pfa.projetpfa.service.model.Image;

import java.util.ArrayList;
import java.util.List;

public class BillConverter {
    public static BillVO toVo(Bill bo) {
        if (bo == null )
            return null;
        BillVO vo = new BillVO();
        vo.setId(bo.getId());
        vo.setOrder(bo.getOrder());
        vo.setTotal_price(bo.getTotal_price());
        vo.setIs_deleted(bo.isIs_deleted());

        return vo;
    }
    public static Bill toBo(BillVO vo) {
        Bill bo = new Bill();
        bo.setId(vo.getId());
        bo.setOrder(vo.getOrder());
        bo.setTotal_price(vo.getTotal_price());
        bo.setIs_deleted(vo.isIs_deleted());
        return bo;
    }
    public static List<BillVO> toListVo(List<Bill> listBo) {
        List<BillVO> listVo = new ArrayList<>();
        for (Bill bill : listBo) {
            listVo.add(toVo(bill));
        }
        return listVo;
    }
}
