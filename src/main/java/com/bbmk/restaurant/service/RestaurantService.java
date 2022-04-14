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

    public String deleteFood(Integer id, String name, int price) {
        return restaurantDao.deleteFood(name, price);
    }

    public void insertFood(Integer id, String name, int price) {
    }

    public void updateFood(Integer id, String name, Integer price) {
        Food matooke = new Food( id, name, price);
        matooke.setId(1);  // id
        matooke.setName("matooke"); // name
        matooke.setPrice(20); // price

        restaurantDao.updateFood(matooke);

    }
}

