package com.bbmk.restaurant.service;

import com.bbmk.restaurant.Dao.UserRepo;
import com.bbmk.restaurant.Dao.UserRepoImpl;
import com.bbmk.restaurant.models.User;
import com.bbmk.restaurant.securityconfig.PasswordConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService  implements UserServiceInterface {
	@Qualifier("rzosknmk@rogue.db.elephantsql.com")
	final UserRepo userRepo;

	@Autowired
	final PasswordConfig passwordConfig;


	public UserService(UserRepo userRepo, BCryptPasswordEncoder bCryptPasswordEncoder, PasswordConfig passwordConfig) {
		this.userRepo = userRepo;
		this.passwordConfig = passwordConfig;
	}


	public void login(String username, String password) {
		User user = userRepo.findByUsername(username);
		if (user != null) {
			if (passwordConfig.bCryptPasswordEncoder().matches(password, user.getPassword())) {
				System.out.println("Login Successful");
			} else {

				System.out.println("Login Failed");
			}
		}

	}




	@Override
	public void logout(User user) {
		System.out.println("Logout Successful");
	}

	@Override
	public void register(User user) {
		user.setPassword(passwordConfig.bCryptPasswordEncoder().encode(user.getPassword()));
		userRepo.save(user);
		System.out.println("Register Successful");

	}

	@Override
	public void update(User user) {
		userRepo.save(user);
		System.out.println("Update Successful");
	}

	@Override
	public void delete(User user) {
		userRepo.delete(user);
		System.out.println("Delete Successful");
	}

	@Override
	public void activateUser(User user) {
		user.setActive(true);
		userRepo.save(user);
		System.out.println("Activate Successful");
	}

	@Override
	public void deactivate(User user) {
		user.setActive(false);
		userRepo.save(user);
		System.out.println("Deactivate Successful");

	}

	@Override
	public void changePassword(User user) {
		user.setPassword(passwordConfig.bCryptPasswordEncoder().encode(user.getPassword()));
		userRepo.save(user);
		System.out.println("Change Password Successful");

	}

	@Override
	public void changeUsername(User user) {
		user.setUsername(user.getUsername());
		userRepo.save(user);
		System.out.println("Change Username Successful");

	}



	public void activate(User user) {
		user.setActive(true);
		userRepo.save(user);
		System.out.println("Activate Successful");
	}

	public void changeEmail(User user) {
		userRepo.save(user);
		System.out.println("Change Email Successful");
	}
}
