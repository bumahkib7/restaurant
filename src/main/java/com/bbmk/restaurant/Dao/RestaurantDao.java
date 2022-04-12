package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;

import java.util.List;
import java.util.UUID;


public interface RestaurantDao {

    default int insertFood(Food food) {
        UUID id = UUID.randomUUID();
        return insertFood(id, name, price);
    }

    List <Food> getAllFood();

    int insertFood(String name, int price);
   String deleteFood(String name, int price);
}