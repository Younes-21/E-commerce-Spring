package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.ImageVO;

import java.util.List;

public interface IImageService {
    List<ImageVO> getImages();
    void save(ImageVO image);
    void delete(Long id);

}
