package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("rzosknmk@rogue.db.elephantsql.com")
@Transactional
public interface RestaurantDao extends JpaRepository<Food, Long> {
    static Integer getId() {
      return Math.toIntExact(Food.getId());
    }

    static Object getPrice() {
        return Food.getPrice();
    }

    static Object getName() {
        return Food.getName();
    }

    List<Food> getAllFood();

   @NotNull
   List<Food> findAll();
   @NotNull
   Optional<Food> findById(Long id);

    void findByName(String name);
    void findByPrice(double price);

    void insertFood(Integer id, String name, Integer price);
    void deleteFoodById(Long id);


    void deleteFood(Integer id, String name, Integer price);

    void updateFood(Food food);

    void updateFoodbyID(Integer id);

    void updateFoodbyName(String name);

    void updateFoodbyPrice(Integer price);


    @Modifying
    @Query("UPDATE Food SET name = :name, price = :price WHERE id = :id")
    void updateFood(Integer id, String name, Integer price);

    @Query("UPDATE Food SET PRICE = :price WHERE id = :id")
    void updateFoodPrice(Integer id, Integer price);

    @Query("UPDATE Food SET name = :name WHERE id = :id")
    void updateFoodName(Integer id, String name);
}


// End of file

