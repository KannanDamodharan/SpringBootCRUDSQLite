package com.example.springbootcrudsqlite.services;

import com.example.springbootcrudsqlite.entities.Product;
import com.example.springbootcrudsqlite.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> search(double min, double max) {
        System.out.println("inside seacrh service ");
        return productRepository.search(min, max);
    }

    @Override
    public Product find(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }
}
