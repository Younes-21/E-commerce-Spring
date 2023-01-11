package com.pfa.projetpfa.domaine;

import com.pfa.projetpfa.service.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderConverter {
    public static OrderVO toVo(Order bo) {
        if (bo == null )
            return null;
        OrderVO vo = new OrderVO();
        vo.setId(bo.getId());
        vo.setOrdered(bo.getOrdered());
        vo.setQuantity(bo.getQuantity());
        vo.setShipped(bo.getShipped());
        vo.setUser(bo.getUser());
        vo.setProduct(bo.getProduct());
        vo.setIs_deleted(bo.isIs_deleted());
        vo.setStatus(bo.getStatus());
        vo.setDelivery_price(bo.getDelivery_price());
        vo.setTotal(bo.getTotal());
        vo.setBill(bo.getBill());
        vo.setDelivery(bo.getDelivery());
        vo.setIs_deleted(bo.isIs_deleted());

        return vo;
    }
    public static Order toBo(OrderVO vo) {
        Order bo = new Order();
        bo.setId(vo.getId());
        bo.setOrdered(vo.getOrdered());
        bo.setQuantity(vo.getQuantity());
        bo.setShipped(vo.getShipped());
        bo.setUser(vo.getUser());
        bo.setProduct(vo.getProduct());
        bo.setIs_deleted(vo.isIs_deleted());
        bo.setStatus(vo.getStatus());
        bo.setDelivery_price(vo.getDelivery_price());
        bo.setTotal(vo.getTotal());
        bo.setBill(vo.getBill());
        bo.setDelivery(vo.getDelivery());
        bo.setIs_deleted(vo.isIs_deleted());

        return bo;
    }
    public static List<OrderVO> toListVo(List<Order> listBo) {
        List<OrderVO> listVo = new ArrayList<>();
        for (Order order : listBo) {
            listVo.add(toVo(order));
        }
        return listVo;
    }
}
