package com.bbmk.restaurant.config;

import com.bbmk.restaurant.Dao.RestaurantDao;
import com.bbmk.restaurant.models.Food;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RestaurantConfig {

	@Bean
	CommandLineRunner commandLineRunner(@Qualifier("rzosknmk") RestaurantDao repository) {
		return args -> {
			new Food(
					1,
					"Pizza",
					3.50

			);
			Food hamburger =new Food(
					2,
					"Hamburger",
					2.50);

			Food fries =new Food(
					3,
					"Fries",
					1.50);

			Food Coke =new Food(
					4,
					"Coke",
					1.50);

			repository.saveAll(
					List.of(
							hamburger,
							fries,
							Coke
					)
			);

		};
	}
}


