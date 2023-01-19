package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.ProductVO;
import com.pfa.projetpfa.service.model.Category;

import java.util.List;

public interface IProductService {
    List<ProductVO> getProducts();

    void save(ProductVO product);

    ProductVO getProductById(Long id);

    void delete(Long id);

    List<ProductVO> getProductsByCategory(Category category);

    List<ProductVO> findAll(int pageId, int size);

    List<ProductVO> sortBy(String fieldName);
}