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

    @Autowired
    final RestaurantDao restaurantDao;


    public RestaurantService(@Qualifier("dcgayrhs") RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<Food> getAllFoods() {
        return restaurantDao.getAllFood();
    }

    public int deleteFood(Integer id, String name, Integer price) {
        return restaurantDao.deleteFood(id,name, price);
    }





    public int insertFood(Integer id, String name, Integer price) {
        return restaurantDao.insertFood(id, name, price);
    }
}





