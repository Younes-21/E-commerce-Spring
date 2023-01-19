package com.pfa.projetpfa.controller;

import com.pfa.projetpfa.domaine.CategoryVO;
import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
    private ICategoryService service;

    @GetMapping("/categories")
    public List<CategoryVO> getCategories(){
        return service.getCategories();
    }
    @PostMapping(value="/categories")
    public CategoryVO save( @RequestBody CategoryVO category){
        return service.save(category);
    }

  /*  @PostMapping(value = "/categories")
    public ResponseEntity<Object> createEmp(@RequestBody CategoryVO categoryVo) {
        service.save(categoryVo);
        return new ResponseEntity<>("category is created successfully", HttpStatus.CREATED);
    }*/
}
