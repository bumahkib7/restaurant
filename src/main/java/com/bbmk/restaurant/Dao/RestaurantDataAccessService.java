package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("nlseuxsa")
public class RestaurantDataAccessService implements RestaurantDao {

    final JdbcTemplate jdbcTemplate;

    public RestaurantDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Food> getAllFood() {
        final String sql = "SELECT name, price FROM menu1";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("name");
            Integer price = Integer.parseInt(resultSet.getString("price"));
            return  new Food(id, name, price);
        });
    }


    @Override
    public int deleteFood(Integer id, String name, int price) {
        return jdbcTemplate.update("DELETE  From menu1 Where id = 1");
    }

    @Override
    public int insertFood(Integer id, String name, int price) {
        return jdbcTemplate.update("INSERT INTO public.Menu1 VALUES (id,name,price)");

    }

    @Override
    public int getFoodByName(String name) {
        return jdbcTemplate.update("SELECT name FROM menu1");
    }

    @Override
    public Optional<Food> getFoodByPrice(int price) {
        return Optional.empty();
    }

}


// End of file
