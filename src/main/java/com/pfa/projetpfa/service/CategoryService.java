package com.pfa.projetpfa.service;

import com.pfa.projetpfa.dao.CategoryRepository;
import com.pfa.projetpfa.domaine.CategoryConverter;
import com.pfa.projetpfa.domaine.CategoryVO;
import com.pfa.projetpfa.service.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService, CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<CategoryVO> getCategories() {
        List<Category> list = categoryRepository.findAll();
        return CategoryConverter.toListVo(list);
    }

    @Override
    public CategoryVO save(CategoryVO category) {
categoryRepository.save(CategoryConverter.toBo(category));
        return category;
    }

    @Override
    public CategoryVO getCategoryById(Long id) {
        boolean found = categoryRepository.existsById(id);
        if (!found)
            return null;
        return CategoryConverter.toVo(categoryRepository.getOne(id));    }

   /* @Override
    public List<CategoryVO> getCategoryByName(String categoryVoName) {
        List<Category> list = categoryRepository.findByName(categoryVoName);
        return CategoryConverter.toListVo(list);
    }*/

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    /*@Override
    public List<CategoryVO> findByName(String name) {
        List<Category> list = categoryRepository.findByName(name);
        return CategoryConverter.toListVo(list);
    }
*/
    @Override
    public void run(String... args) throws Exception {

    }
}
