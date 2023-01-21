package com.pfa.projetpfa.domaine;

import com.pfa.projetpfa.service.model.Category;
import com.pfa.projetpfa.service.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryConverter {
    public static CategoryVO toVo(Category bo) {
        if (bo == null || bo.getId() ==null)
            return null;
        CategoryVO vo = new CategoryVO();
        vo.setId(bo.getId());
        vo.setName(bo.getName());
        vo.setProducts(bo.getProducts());
        vo.setIs_deleted(bo.isIs_deleted());
        return vo;
    }
    public static Category toBo(CategoryVO vo) {
        Category bo = new Category();
        bo.setId(vo.getId());
        bo.setName(vo.getName());
        bo.setProducts(vo.getProducts());
        bo.setIs_deleted(vo.isIs_deleted());
        return bo;
    }
    public static List<CategoryVO> toListVo(List<Category> listBo) {
        List<CategoryVO> listVo = new ArrayList<>();
        for (Category category : listBo) {
            listVo.add(toVo(category));
        }
        return listVo;
    }
}
