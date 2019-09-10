package com.springbootRestSec4.Filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootRestSec4.Mappings.User;
import com.springbootRestSec4.Services.HttpParserService;

public class LoginFilter extends AbstractAuthenticationProcessingFilter {

	private HttpParserService httpParserService;

	public LoginFilter(String url, AuthenticationManager manager) {

		super(url);
		httpParserService = new HttpParserService();
		setAuthenticationManager(manager);

	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {

		// lee el usuario y la clave de una peticion post en la cual los adjuntemos via
		// json

		User user = new ObjectMapper().readValue(request.getInputStream(), User.class);
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		UsernamePasswordAuthenticationToken clientUser = new UsernamePasswordAuthenticationToken(user.getName(),
				user.getPassword());

		return getAuthenticationManager().authenticate(clientUser);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authentication) throws IOException, ServletException {

		String userName = authentication.getName();
		httpParserService.createToken(response, userName);

	}

}
