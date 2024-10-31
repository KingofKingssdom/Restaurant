package com.laptrinhweb.RestaurantPizza.Repository;


import com.laptrinhweb.RestaurantPizza.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image,Integer> {
}
