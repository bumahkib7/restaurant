package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("dcgayrhs")
public class RestaurantDataAccessService implements RestaurantDao {

    final JdbcTemplate jdbcTemplate;

    public RestaurantDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public List<Food> getAllFood() {
        final String sql = "SELECT * FROM menu";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            Integer id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("name");
            int price = Integer.parseInt(resultSet.getString("price"));
            return  new Food(id, name, price);
        });
    }


    @Override
    public Integer deleteFood(Integer id, String name, Integer price) {
        return jdbcTemplate.update("DELETE  From menu Where id = 1");
    }

    @Override
    public Integer insertFood(Integer id, String name, Integer price) {
        return jdbcTemplate.update("INSERT INTO public.Menu VALUES (id,name,price)");

    }

    @Override
    public Integer getFoodByName(String name) {
        return jdbcTemplate.update("SELECT name FROM menu");
    }

    @Override
    public Optional<Food> getFoodByPrice(Integer price) {
        return Optional.empty();
    }

}


// End of file
