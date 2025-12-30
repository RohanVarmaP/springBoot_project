package com.rohan.springBoot_project.service;

import com.rohan.springBoot_project.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Samsung",30000),
            new Product(103,"IQ00",45000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        return products
                .stream()
                .filter(prod->prod.getProductId()==productId)
                .findFirst()
                .orElse(new Product(100,"no Item",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
