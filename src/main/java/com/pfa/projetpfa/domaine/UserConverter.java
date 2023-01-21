package com.pfa.projetpfa.domaine;


import com.pfa.projetpfa.service.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {
    public static UserVO toVo(User bo) {
        if (bo == null )
            return null;
        UserVO vo = new UserVO();
        vo.setId(bo.getId());
        vo.setFirst_name(bo.getFirst_name());
        vo.setLast_name(bo.getLast_name());
        vo.setPhone(bo.getPhone());
        vo.setAddress(bo.getAddress());
        vo.setCredit_card(bo.getCredit_card());
        vo.setEmail(bo.getEmail());
        vo.setPassword(bo.getPassword());
        vo.setRole(bo.getRole());
        vo.setIs_deleted(bo.isIs_deleted());
        vo.setPayment(bo.getPayment());
        vo.setOrder(bo.getOrder());
        vo.setBasket(bo.getBasket());
        return vo;
    }
    public static User toBo(UserVO vo) {
        User bo = new User();
        bo.setId(vo.getId());
        bo.setFirst_name(vo.getFirst_name());
        bo.setLast_name(vo.getLast_name());
        bo.setPhone(vo.getPhone());
        bo.setAddress(vo.getAddress());
        bo.setCredit_card(vo.getCredit_card());
        bo.setEmail(vo.getEmail());
        bo.setPassword(vo.getPassword());
        bo.setRole(vo.getRole());
        bo.setIs_deleted(vo.isIs_deleted());
        bo.setPayment(vo.getPayment());
        bo.setOrder(vo.getOrder());
        bo.setBasket(vo.getBasket());
        return bo;
    }
    public static List<UserVO> toListVo(List<User> listBo) {
        List<UserVO> listVo = new ArrayList<>();
        for (User user : listBo) {
            listVo.add(toVo(user));
        }
        return listVo;
    }
}
