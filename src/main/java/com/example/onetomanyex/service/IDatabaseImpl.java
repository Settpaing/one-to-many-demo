package com.example.onetomanyex.service;

import com.example.onetomanyex.domain.Category;
import com.example.onetomanyex.domain.Product;
import com.example.onetomanyex.repository.CategoryRepository;
import com.example.onetomanyex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IDatabaseImpl implements IDatabase {

   private final CategoryRepository categoryRepository;
   private final ProductRepository productRepository;

    public IDatabaseImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public void createDatabase() {
        Category c1 = new Category();
        c1.setName("Fruits");
        Category c2 = new Category();
        c2.setName("Meats");

        Product p1 = new Product("Apple",23,1000);
        Product p2 = new Product("Orange",23,500);
        Product p3 = new Product("Fish",23,10000);
        Product p4 = new Product("Chicken",23,15000);

        c1.addProductP(p1);
        c1.addProductP(p2);
        c2.addProductP(p3);
        c2.addProductP(p4);

        categoryRepository.save(c1);
        categoryRepository.save(c2);

      /*  productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4); */
    }
}
