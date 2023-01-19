package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.CategoryVO;

import java.util.List;

public interface ICategoryService {
    List<CategoryVO> getCategories();
    CategoryVO save(CategoryVO category);

    CategoryVO getCategoryById(Long id);
    void delete(Long id);
}
