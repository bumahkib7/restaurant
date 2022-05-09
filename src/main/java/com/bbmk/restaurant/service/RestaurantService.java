package com.bbmk.restaurant.service;

import com.bbmk.restaurant.Dao.RestaurantDao;
import com.bbmk.restaurant.models.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *
 */
@Service
public class RestaurantService {

    @Qualifier("rzosknmk")
    @Autowired
    final RestaurantDao restaurantDao;
    @Autowired
    public RestaurantService(@Qualifier("rzosknmk") RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<Food> getAllFoods() {
        return restaurantDao.getAllFood();
    }

    public void insertFood(Integer id, String name, Integer price) {
        restaurantDao.insertFood(id, name, price);
    }

    public void deleteFoodById(Integer id, String name, Integer price) {
        restaurantDao.deleteFood(id, name, price);
    }

    public void deleteFoodById(Long id) {
        restaurantDao.deleteFoodById(id);
    }

    public void updateFood(Food food) {
    restaurantDao.updateFoodName(Math.toIntExact(Food.getId()), Food.getName());
    }

    public void updateFoodbyID(Integer id) {
        restaurantDao.updateFoodbyID(id);
    }

    public void deleteFood(int toIntExact, String name, double price) {
        restaurantDao.deleteFood(toIntExact, name, (int) price);

    }

    public void updateFoodbyName(String name) {
        restaurantDao.updateFoodbyName(name);
    }
}





