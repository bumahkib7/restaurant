package com.bbmk.restaurant.service;

import com.bbmk.restaurant.Dao.RestaurantDao;
import com.bbmk.restaurant.models.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    final RestaurantDao restaurantDao;


    public RestaurantService(@Qualifier("nlseuxsa")RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<Food> getAllFoods() {
        return restaurantDao.getAllFood();
    }

    public String deleteFood(String name, int price) {
        return restaurantDao.deleteFood(name, price);
    }


    public int insertFood(String name, int price) {
        return 0;
    }
}

