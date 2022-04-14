package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
        final String sql = "SELECT name, price FROM menus";
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
                "INSERT INTO public.menus (name, price) VALUES (?, ?)",
                name, price
        );
    }

    @Override
    public String deleteFood(String name, int price) {
        return null;
    }

    @Override
    public List<Food> getFoodByName(String name) {
        return null;
    }

    @Transactional
    @Override
    public List<Food> getFoods() {
        return null;
    }

    @Transactional
    @Override
    public Optional<Food> getFood(Integer id) {
        return Optional.empty();
    }

    @Override
    public void addFood(Food food) {

    }

    @Override
    public void updateFood(Food matooke) {
        jdbcTemplate.update( "UPDATE public.menus SET name = ?, price = ? WHERE id = ?");

    }

    @Override
    public void deleteFood(Integer id) {

    }
}








// End of file
