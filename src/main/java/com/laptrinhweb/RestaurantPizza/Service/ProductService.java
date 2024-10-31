package com.laptrinhweb.RestaurantPizza.Service;

import com.laptrinhweb.RestaurantPizza.Entity.Product;
import com.laptrinhweb.RestaurantPizza.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    // Lấy sản phẩm theo id
    public Product findProductById(int id){
        return productRepository.findById(id).orElseThrow();
    }
    // Lấy toàn bộ sản phẩm
    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }
}
