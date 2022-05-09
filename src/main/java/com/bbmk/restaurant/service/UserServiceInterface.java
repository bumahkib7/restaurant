package com.bbmk.restaurant.service;

import com.bbmk.restaurant.models.User;

import java.io.IOException;

public interface UserServiceInterface {

	void login(String username, String password) throws IOException;
	void logout(User user);
	void register(User user) throws IOException;
	void update(User user);
	void delete(User user);

	void activateUser(User user);
	void deactivate(User user);

	void changePassword(User user);

	void changeUsername(User user);


}
