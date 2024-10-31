package com.laptrinhweb.RestaurantPizza.Controller.User;

import com.laptrinhweb.RestaurantPizza.Entity.Product;
import com.laptrinhweb.RestaurantPizza.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    // Lấy sản phẩm theo id
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id){
        Product product = productService.findProductById(id);
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(product);
        }
    }
}
