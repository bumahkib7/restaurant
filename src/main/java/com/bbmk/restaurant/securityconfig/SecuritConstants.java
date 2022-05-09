package com.bbmk.restaurant.securityconfig;

public class SecuritConstants {
	public static final String SECRETS = "SecretKeyToGenrateJWTToken";
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users/sign-up";
	public static final String LOGIN_URL = "/users/login";
	public static final String LOGOUT_URL = "/users/logout";
	public static final String SIGN_UP_URL2 = "api/v1/food/sign-up";




}
