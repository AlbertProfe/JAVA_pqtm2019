package com.springbootRestSec4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.springbootRestSec4.Filters.JWTAuthenticationFilter;
import com.springbootRestSec4.Filters.LoginFilter;

@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		PasswordEncoder coder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication().withUser("natalia").password(coder.encode("1234")).roles("ADMINISTRATOR");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().cors().and()
		.authorizeRequests().antMatchers(HttpMethod.POST, "/webapi/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.addFilterBefore(new LoginFilter("/webapi/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
		.addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
		

	}
	
	 @Bean
	 CorsConfigurationSource corsConfigurationSource()

	    {

	        CorsConfiguration configuration = new CorsConfiguration();
	        configuration.setAllowCredentials(true);
	        configuration.addAllowedOrigin("http://localhost:8081");
	        configuration.addAllowedHeader("*");
	        configuration.addExposedHeader("Authorization");
	        configuration.addAllowedMethod("*");
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", configuration);
	        return source;

	    }

}
