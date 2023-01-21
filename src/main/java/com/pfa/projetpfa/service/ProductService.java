package com.pfa.projetpfa.service;

import com.pfa.projetpfa.dao.ProductRepository;
import com.pfa.projetpfa.domaine.ProductConverter;
import com.pfa.projetpfa.domaine.ProductVO;
import com.pfa.projetpfa.service.model.Category;
import com.pfa.projetpfa.service.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService, CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductVO> getProducts() {
        List<Product> list = productRepository.findAll();
        return ProductConverter.toListVo(list);
    }

    @Override
    public void save(ProductVO product) {
        productRepository.save(ProductConverter.toBo(product));
    }

    @Override
    public ProductVO getProductById(Long id) {
        boolean foundProduct = productRepository.existsById(id);
        if (!foundProduct)
            return null;
        return ProductConverter.toVo(productRepository.getOne(id));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductVO> getProductsByCategory(Category category) {
        return null;
    }

    @Override
    public List<ProductVO> findAll(int pageId, int size) {
        return null;
    }

    @Override
    public List<ProductVO> sortBy(String fieldName) {
        return null;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.print("This is a ProductService.java in the run methode");
    }
}