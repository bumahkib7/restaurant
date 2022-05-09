package com.bbmk.restaurant.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "users")
public class User {


	public boolean isActive;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)





	private Long id;
	private String password;
	@Access(AccessType.FIELD)
	@NotNull
	@Max(value = 200, message = "User is not active")
	private String username;

	public User(User user) {
		this.id = user.getId();
		this.password = user.getPassword();
		this.username = user.getUsername();
		this.isActive = user.isActive();


	}

	private boolean isActive() {
		return isActive;
	}


	public Long setId(Long id) {
		return this.id = id;
	}

	public User() {

	}

	public User(Long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String  getPassword() {
		return password;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';

	}

	public void setActive(boolean b) {
		isActive = b;

	}

	public void addAttribute(String user, String username) {
		this.username = username;
		this.password = user;
	}
}