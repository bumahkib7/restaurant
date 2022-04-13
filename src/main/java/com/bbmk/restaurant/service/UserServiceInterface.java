package com.bbmk.restaurant.service;

import com.bbmk.restaurant.models.User;

public interface UserServiceInterface {

	void login(String username, String password);
	void logout(User user);
	void register(User user);
	void update(User user);
	void delete(User user);


}
