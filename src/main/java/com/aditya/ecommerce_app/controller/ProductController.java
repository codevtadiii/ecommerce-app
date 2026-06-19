
package com.aditya.ecommerce_app.controller;

import com.aditya.ecommerce_app.model.Product;
import com.aditya.ecommerce_app.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/products") 
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
}
}
