package com.bbmk.restaurant.Api;


import com.bbmk.restaurant.models.User;
import com.bbmk.restaurant.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import javax.validation.Valid;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;


@RestController
@Configuration
@RequestMapping("api/v1/users")
public class UserController implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/login");
		WebMvcConfigurer.super.addInterceptors(registry);
	}


	@PostMapping("/")
	public String validateLoginInfo(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "login";
		}user.addAttribute("user", user.getUsername());
		return "home";
	}

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

	@PutMapping("/activate")
	public void activateUser() {
		userService.activate(user);
	}

	@PutMapping("/deactivate")
	public void deactivateUser() {
		userService.deactivate(user);
	}

	@PutMapping("/change_password")
	public void changePassword() {
		userService.changePassword(user);
	}

	@PutMapping("/change_username")
	public void changeUsername() {
		userService.changeUsername(user);
	}

	@PatchMapping("/change_email")
	public void changeEmail() {
		userService.changeEmail(user);
	}


	private class LoginInterceptor implements HandlerInterceptor {
		@Override
		public boolean preHandle(@NotNull javax.servlet.http.HttpServletRequest request, @NotNull javax.servlet.http.HttpServletResponse response, @NotNull Object handler) throws IOException {
			if (user == null) {
				response.sendRedirect("/user/login");
				return false;
			}	return true;

		}
	}
}


