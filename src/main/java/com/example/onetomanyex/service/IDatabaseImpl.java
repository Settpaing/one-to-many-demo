package com.example.onetomanyex.service;

import com.example.onetomanyex.domain.Category;
import com.example.onetomanyex.domain.Product;
import com.example.onetomanyex.repository.CategoryRepository;
import com.example.onetomanyex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDatabaseImpl implements IDatabase {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createDatabase() {
        Category c1 = new Category();
        c1.setName("Fruits");
        Category c2 = new Category();
        c2.setName("Meats");

        Product p1 = new Product("Apple",23,1000);
        Product p2 = new Product("Orange",23,500);
        Product p3 = new Product("Fish",23,10000);
        Product p4 = new Product("Chicken",23,15000);

        c1.getProducts().add(p1);
        c1.getProducts().add(p2);
        c2.getProducts().add(p3);
        c2.getProducts().add(p4);
    }
}
