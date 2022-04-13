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

    @Qualifier("rzosknmk@rogue.db.elephantsql.com")
    @Autowired
    final RestaurantDao restaurantDao;


    public RestaurantService(@Qualifier("rzosknmk@rogue.db.elephantsql.com") RestaurantDao restaurantDao) {
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
}





