package com.springbootRestSec4.Services;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;

import com.springbootRestSec4.Mappings.AuthenticatedUser;

public class HttpParserService {
	
	 private long expiration = 3600000;
     private String masterPassword = "superSecretNatalia1234"; 
     private String prefixToken = "Bearer";    
     private String headerHttp = "Authorization";
    // private TokenService tokenService;
	
	
	
	public void createToken(HttpServletResponse response , String user) {
		
		String JWT = new TokenService().createToken(user,masterPassword,new Date (System.currentTimeMillis()+expiration));
		response.addHeader(headerHttp, prefixToken + " " + JWT);
		
	}
	
	public Authentication readToken (HttpServletRequest request) {
		
		 String token = request.getHeader(headerHttp);
		
		 if (token!=null) {
			 String actualToken = token.substring(token.indexOf(" ")+1);
			 String user = new TokenService().readToken(actualToken,masterPassword);
			 
			 if(user!=null) {
				 return new AuthenticatedUser(user);
			 } 
		 }
		 
		 
		return null;
		
	}

}
