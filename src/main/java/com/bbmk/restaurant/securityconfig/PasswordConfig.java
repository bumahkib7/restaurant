package com.bbmk.restaurant.securityconfig;

import com.bbmk.restaurant.Dao.UserRepo;
import com.bbmk.restaurant.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;


@Configuration
public class PasswordConfig {

	User user;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}


	@Bean
	@Transactional(rollbackFor = Exception.class)
	public String saveDto(UserRepo userRepo, BCryptPasswordEncoder bCryptPasswordEncoder) {
		user.setPassword(bCryptPasswordEncoder
				.encode(user.getPassword()));
		return save(new User(user));
	}

	private String save(User user) {
		return user.getPassword();
	}


}
