package com.pfa.projetpfa.service;

import com.pfa.projetpfa.dao.ImageRepository;
import com.pfa.projetpfa.domaine.ImageConverter;
import com.pfa.projetpfa.domaine.ImageVO;
import com.pfa.projetpfa.service.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService implements IImageService , CommandLineRunner {
  @Autowired
  private ImageRepository imageRepository;
    @Override
    public List<ImageVO> getImages() {
List<Image> list = imageRepository.findAll();
return ImageConverter.toListVo(list);
    }

    @Override
    public void save(ImageVO image) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
