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

    @GetMapping(value = "/categories/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCategoryById(@PathVariable(value = "id") Long categoryVoId){
        CategoryVO categoryVoFound = service.getCategoryById(categoryVoId);
        if (categoryVoFound == null)
            return new ResponseEntity<>("category doesn't exist", HttpStatus.OK);
        return new ResponseEntity<>(categoryVoFound, HttpStatus.OK);
    }
  @PostMapping(value = "/categories" /*,produces = "application/json;charset=UTF-8"*/)
  public ResponseEntity<Object> createCategory(@Validated @RequestBody CategoryVO categoryVo) {
      service.save(categoryVo);
      return new ResponseEntity<>("category is created successfully",HttpStatus.CREATED);
  }

    /* Anas's delete
    @PutMapping(value = "/categories/delete/{id}")
    public ResponseEntity<Object> deleteCategory(@PathVariable(name = "id") Long categoryVoId, @RequestBody CategoryVO categoryVo){
        CategoryVO categoryVoFound = service.getCategoryById(categoryVoId);
        if (categoryVoFound == null)
            return new ResponseEntity<>("Category doesn't exist", HttpStatus.OK);
        categoryVoFound.setIs_deleted(true);
        service.save(categoryVoFound);
        return new ResponseEntity<>("Category deleted successfully", HttpStatus.OK);
    }*/
    @DeleteMapping(value = "/categories/{id}")
    public ResponseEntity<Object> deleteCategory(@PathVariable(name = "id") Long categoryVoId) {
        CategoryVO categoryVoFound = service.getCategoryById(categoryVoId);
        if (categoryVoFound == null)
            return new ResponseEntity<>("category doen't exist", HttpStatus.OK);
        service.delete(categoryVoId);
        return new ResponseEntity<>("category is deleted successsfully",HttpStatus.OK);
    }
    @PutMapping(value = "/categories/{id}")
    public ResponseEntity<Object> updateCategory(@PathVariable(name = "id") Long categoryVoId, @RequestBody CategoryVO categoryVo){
        CategoryVO categoryVoFound = service.getCategoryById(categoryVoId);
        if (categoryVoFound == null)
            return new ResponseEntity<>("Category doesn't exist", HttpStatus.OK);
        categoryVo.setId(categoryVoId);
        service.save(categoryVo);
        return new ResponseEntity<>("Category updated successfully", HttpStatus.OK);
    }

}
