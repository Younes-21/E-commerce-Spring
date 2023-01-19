package com.pfa.projetpfa.controller;

import com.pfa.projetpfa.domaine.ImageVO;
import com.pfa.projetpfa.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("api/image")
public class ImageController {
    @Autowired
    private IImageService service;

    @GetMapping(value = "/images")
    public List<ImageVO> getAll(){
        return service.getImages();
    }


}
