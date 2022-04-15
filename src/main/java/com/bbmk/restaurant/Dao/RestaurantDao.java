package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;



public interface RestaurantDao {

    @Transactional
    List<Food> getFoods();

    @Transactional
    Optional<Food> getFood(Integer id);

    @Transactional
    void addFood(Food food);

    @Transactional
     void updateFood(Food food);

    @Transactional
    void deleteFood(Integer id);

    List<Food> getAllFood();

    @Transactional
    int insertFood(String name, int price);

    String deleteFood(String name, int price);
    List<Food> getFoodByName(String name);

}

// End of file
