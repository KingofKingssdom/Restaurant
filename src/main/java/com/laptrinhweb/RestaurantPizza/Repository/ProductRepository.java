package com.laptrinhweb.RestaurantPizza.Repository;


import com.laptrinhweb.RestaurantPizza.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
