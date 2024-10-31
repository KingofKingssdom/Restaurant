package com.laptrinhweb.RestaurantPizza.Repository;
import com.laptrinhweb.RestaurantPizza.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
