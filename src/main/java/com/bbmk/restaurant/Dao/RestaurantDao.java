package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
public interface RestaurantDao {

    List<Food> getAllFood();
    Integer deleteFood(Integer id, String name, Integer price);
    Integer insertFood(Integer id, String name, Integer price);
    Integer getFoodByName(String name);
    Optional<Food> getFoodByPrice(Integer price);
}

