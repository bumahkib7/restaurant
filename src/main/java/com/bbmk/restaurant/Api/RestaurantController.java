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
     public int insertFood(@RequestBody Food food) {
        return restaurantService.insertFood(food.getId(), food.getName(), food.getPrice());
     }
     @GetMapping
    public List<Food> getAllFoods() {
        return restaurantService.getAllFoods();
     }
    @DeleteMapping
    public int deleteFood(Integer id, String name, int price) {
        return restaurantService.deleteFood(id, name, price);
    }
}