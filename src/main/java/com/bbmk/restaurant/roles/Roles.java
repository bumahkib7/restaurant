package com.bbmk.restaurant.roles;

public enum Roles {
	ADMIN, MANAGER, EMPLOYEE, CUSTOMER;

	public static Roles getRole(String role) {
		switch (role) {
			case "ADMIN":
				return ADMIN;
			case "MANAGER":
				return MANAGER;
			case "EMPLOYEE":
				return EMPLOYEE;
			case "CUSTOMER":
				return CUSTOMER;
			default:
				System.out.println("Invalid Role");
				break;
		}
		return Roles.CUSTOMER;
	}
}

