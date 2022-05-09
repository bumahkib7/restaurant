package com.bbmk.restaurant.Api;


import com.bbmk.restaurant.models.User;
import com.bbmk.restaurant.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.ManyToOne;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
	final UserService userService;
	@ManyToOne
	public User user;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@GetMapping("/login")
	public void loginUser() {
		userService.login(
				user.getUsername(),
				user.getPassword()
		);
	}


	@GetMapping("/logout")
	public void logoutUser() {
		userService.logout(user);
	}


	@GetMapping("/register")
	public void registerUser() {
		userService.register(user);
	}


	@GetMapping("/update")
	public void updateUser() {
		userService.update(user);
	}


	@GetMapping("/delete")
	public void deleteUser() {
		userService.delete(user);
	}
	
}


