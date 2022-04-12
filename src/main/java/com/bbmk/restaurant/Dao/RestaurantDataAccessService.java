package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("nlseuxsa")
public class RestaurantDataAccessService implements RestaurantDao {

    final JdbcTemplate jdbcTemplate;

    public RestaurantDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Food> getAllFood(){
        final String sql = "SELECT name, price FROM menu";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("name");
            int price = Integer.parseInt(resultSet.getString("price"));
            return new Food(id, name, price);
        });
    }


    @Override
    @Transactional
    public int insertFood(String name, int price) {

         return jdbcTemplate.update(
                 "INSERT INTO public.menu (name, price) VALUES (?, ?)",
                 name, price
         );
    }

    @Override
    public String deleteFood(String name, int price) {
        return null;
    }

    @Override
    public int deleteFoodById(UUID id) {

        return 0;
    }

    @Override
    public int updateFoodById(UUID id, Food food) {
        return 0;
    }

    @Override
    public int insertFood(Food food) {
        return 0;
    }

    @Override
    public void updateFoodById(UUID id, String name, int price) {

    }

    @Override
    public int insertFood(UUID id, Food food) {
        return 0;
    }

    @Override
    public List<Food> getFoods() {
        return null;
    }

    @Override
    public Optional<Food> getFoodById(UUID id) {
        return null;
    }

    @Override
    public Optional<Food> getFoodByName(String name) {
        return null;
    }

    @Override
    public Optional<Food> getFoodByPrice(int price) {
        return Optional.empty();
    }

}


// End of file
