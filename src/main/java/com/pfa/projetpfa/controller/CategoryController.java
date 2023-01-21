package com.pfa.projetpfa.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pfa.projetpfa.domaine.CategoryVO;
import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
    private ICategoryService service;

    @GetMapping(value="/categories"/*, produces = MediaType.APPLICATION_JSON_VALUE*/)
    public List<CategoryVO> getCategories(){
        return service.getCategories();
    }
  @PostMapping(value = "/categories" /*,produces = "application/json;charset=UTF-8"*/)
  public ResponseEntity<Object> createCategory(@Validated @RequestBody CategoryVO categoryVo) {
      service.save(categoryVo);
      return new ResponseEntity<>("category is created successfully",HttpStatus.CREATED);
  }
}
