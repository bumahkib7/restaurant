package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("rzosknmk@rogue.db.elephantsql.com")
@Transactional
public interface RestaurantDao extends JpaRepository<Food, Long> {
   List<Food> getAllFood();

   List<Food> findAll();
   Optional<Food> findById(Long id);

    void findByName(String name);
    void findByPrice(double price);

    void insertFood(Integer id, String name, Integer price);
    void deleteFoodById(Long id);


    void deleteFood(Integer id, String name, Integer price);
}


// End of file

