package com.example.springbootcrudsqlite.services;

import com.example.springbootcrudsqlite.entities.Product;

import java.util.List;

public interface ProductService {

    public Iterable<Product> findAll();
    public List<Product> search(double min, double max);

    public Product find(int id);

    public Product save(Product product);

    public void delete(int id);


}
