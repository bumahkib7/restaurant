package com.bbmk.restaurant.Api;

import com.bbmk.restaurant.models.Food;
import com.bbmk.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/food")

public class RestaurantController {
    @Autowired
    final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;

    }
    @PostMapping
     public void insertFood(@RequestBody Integer id, String name, Integer price) {
        restaurantService.insertFood(id, name, price);
    }


    @GetMapping
    public List<Food> getAllFoods() {
        return restaurantService.getAllFoods();
     }
    @DeleteMapping
    public String deleteFood(Integer id, String name, Integer price) {

        return restaurantService.deleteFood(id, name, price);
    }
    @PutMapping
    public void updateFood(Integer id, String name, Integer price) {
        restaurantService.updateFood(id, name, price);
    }


}


