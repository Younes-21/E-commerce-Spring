package com.pfa.projetpfa.domaine;

import com.pfa.projetpfa.service.model.Bill;
import com.pfa.projetpfa.service.model.Category;
import com.pfa.projetpfa.service.model.Delivery;

import java.util.ArrayList;
import java.util.List;

public class DeliveryConverter {
    public static DeliveryVO toVo(Delivery bo) {
        if (bo == null)
            return null;
        DeliveryVO vo = new DeliveryVO();
        vo.setId(bo.getId());
        vo.setStart_date(bo.getStart_date());
        vo.setArrived_date(bo.getArrived_date());
        vo.setOrder(bo.getOrder());
        vo.setIs_deleted(bo.isIs_deleted());
        return vo;
    }
    public static Delivery toBo(DeliveryVO vo) {
        Delivery bo = new Delivery();
        bo.setId(vo.getId());
        bo.setStart_date(vo.getStart_date());
        bo.setArrived_date(vo.getArrived_date());
        bo.setOrder(vo.getOrder());
        bo.setIs_deleted(vo.isIs_deleted());
        return bo;
    }
    public static List<DeliveryVO> toListVo(List<Delivery> listBo) {
        List<DeliveryVO> listVo = new ArrayList<>();
        for (Delivery delivery : listBo) {
            listVo.add(toVo(delivery));
        }
        return listVo;
    }
}
