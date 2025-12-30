package com.rohan.springBoot_project.repository;

import com.rohan.springBoot_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    void removeByProductId(int productId);
}
