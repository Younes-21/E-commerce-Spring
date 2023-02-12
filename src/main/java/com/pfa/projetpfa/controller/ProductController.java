package com.pfa.projetpfa.controller;

import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.domaine.ProductVO;
import com.pfa.projetpfa.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private IProductService service;
    @GetMapping(value = "/productss")
    public String test(){
        return "Hello";
    }
    @GetMapping(value = "/products")
    public List<ProductVO> getAll(){
        return service.getProducts();
    }

    /*@GetMapping(value = "/api/product/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable(value = "id") Long productVoId){
        ProductVO productVoFound = service.getProductById(productVoId);
        if (productVoFound == null)
            return new ResponseEntity<>("product doesn't exist", HttpStatus.OK);
        return new ResponseEntity<>(productVoFound, HttpStatus.OK);
    }*/
    @PutMapping(value = "/products/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(name = "id") Long productVoId, @RequestBody ProductVO productVo) {
        ProductVO productVoFound = service.getProductById(productVoId);
        if (productVoFound == null)
            return new ResponseEntity<>("product doen't exist", HttpStatus.OK);
        productVo.setId(productVoId);
        service.save(productVo);
        return new ResponseEntity<>("Product is updated successsfully",HttpStatus.OK);
    }
}