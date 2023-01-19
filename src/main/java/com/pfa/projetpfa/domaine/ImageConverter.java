package com.pfa.projetpfa.domaine;
import com.pfa.projetpfa.service.model.Image;

import java.util.ArrayList;
import java.util.List;

public class ImageConverter {
    public static ImageVO toVo(Image bo) {
        if (bo == null )
            return null;
        ImageVO vo = new ImageVO();
        vo.setId(bo.getId());
        vo.setImg(bo.getImg());
        vo.setProduct(bo.getProduct());
        vo.setIs_deleted(bo.isIs_deleted());

        return vo;
    }
    public static Image toBo(ImageVO vo) {
        Image bo = new Image();
        bo.setId(vo.getId());
        bo.setImg(vo.getImg());
        bo.setProduct(vo.getProduct());
        bo.setIs_deleted(vo.isIs_deleted());
        return bo;
    }
    public static List<ImageVO> toListVo(List<Image> listBo) {
        List<ImageVO> listVo = new ArrayList<>();
        for (Image image : listBo) {
            listVo.add(toVo(image));
        }
        return listVo;
    }
}
