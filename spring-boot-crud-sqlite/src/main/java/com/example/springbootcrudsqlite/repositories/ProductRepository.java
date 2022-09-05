package com.example.springbootcrudsqlite.repositories;

import com.example.springbootcrudsqlite.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("from Product where price >= :min and price <= :max")
    public List<Product> search(@Param("min") double min, @Param("max") double max);
}
