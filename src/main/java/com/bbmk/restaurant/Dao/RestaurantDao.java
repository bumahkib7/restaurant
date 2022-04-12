package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface RestaurantDao {
    void updateFoodById(UUID id, String name, int price);

    int insertFood(UUID id, Food food);



    List<Food> getFoods();

    Optional<Food> getFoodById(UUID id);

    @Transactional
    default int insertFoods(List<Food> foods) {
        int count = 0;
        for (Food food : foods) {
            count += insertFood(food);
        }
        return count;
    }

    int insertFood(Food food);


    List<Food> getAllFood();

    @Transactional
    int insertFood(String name, int price);

    String deleteFood(String name, int price);

    Optional<Food> getFoodByName(String name);

    Optional<Food> getFoodByPrice(int price);
}

