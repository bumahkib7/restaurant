package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public String deleteFood(String name) {
        String sql = "DELETE FROM public.menu WHERE name=?";
        return jdbcTemplate.query(
                String.valueOf(new Object[] {name}))==1;
    }


}
