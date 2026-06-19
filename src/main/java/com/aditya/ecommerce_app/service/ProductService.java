package com.aditya.ecommerce_app.service;

import com.aditya.ecommerce_app.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "iPhone 16", 85000));
        products.add(new Product(2, "Samsung S26", 75000));
        products.add(new Product(3, "MacBook Pro", 180000));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}
