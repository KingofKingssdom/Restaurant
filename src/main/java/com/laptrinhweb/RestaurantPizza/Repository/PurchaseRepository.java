package com.laptrinhweb.RestaurantPizza.Repository;


import com.laptrinhweb.RestaurantPizza.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {
}
