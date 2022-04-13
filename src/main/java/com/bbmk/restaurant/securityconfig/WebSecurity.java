package com.bbmk.restaurant.securityconfig;

import com.bbmk.restaurant.service.RestaurantService;
import com.bbmk.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import static com.bbmk.restaurant.securityconfig.SecuritConstants.*;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private final UserService userService;
	@Autowired
	private final RestaurantService restaurantService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public WebSecurity(UserService userService, RestaurantService restaurantService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userService = userService;
		this.restaurantService = restaurantService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().authorizeRequests()
				.antMatchers(HttpMethod.POST, SIGN_UP_URL,SIGN_UP_URL2).permitAll()
				.antMatchers(HttpMethod.GET, LOGIN_URL,LOGOUT_URL).permitAll()
				.anyRequest().authenticated()
				.and()
				.addFilter(new JWTAuthenticationFilter(authenticationManager()))
				.addFilter(new JWTAuthorizationFilter(authenticationManager()))
				// this disables session creation on Spring Security
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and()
				.csrf().disable();

	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		CorsConfiguration corsConfiguration = new CorsConfiguration().applyPermitDefaultValues();
		source.registerCorsConfiguration("/**", corsConfiguration);

		return source;
	}
}
