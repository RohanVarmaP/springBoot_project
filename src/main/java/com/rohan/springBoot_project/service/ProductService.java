package com.rohan.springBoot_project.service;

import com.rohan.springBoot_project.model.Product;
import com.rohan.springBoot_project.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
//import java.text.DateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo prodRepo;

//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Samsung",30000),
//            new Product(103,"IQ00",45000)));

    public List<Product> getProducts() {
//        return products;
        return prodRepo.findAll();
    }

    public Product getProductById(int productId) {
//        return products
//                .stream()
//                .filter(prod->prod.getProductId()==productId)
//                .findFirst()
//                .orElse(new Product(100,"no Item",0));
        return prodRepo.findById(productId).orElse(new Product(100,"no Object Found","-","-","-", null, BigDecimal.ZERO));
    }

    public void addProduct(Product prod){
//        products.add(prod);
        prodRepo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProductId()==prod.getProductId()){
//                index=i;
//            }
//        }
//        products.set(index,prod);
        prodRepo.save(prod);
    }

    public void deleteProduct(int productId) {
//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProductId()==productId){
//                index=i;
//            }
//        }
//        products.remove(index);
        prodRepo.removeByProductId(productId);
    }
}
