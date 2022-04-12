package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public interface RestaurantDao {


    int insertFood(Integer id, String name, int price);


    List<Food> getAllFood();


    int deleteFood(Integer id, String name, int price);

    int getFoodByName(String name);

    Optional<Food> getFoodByPrice(int price);
}

