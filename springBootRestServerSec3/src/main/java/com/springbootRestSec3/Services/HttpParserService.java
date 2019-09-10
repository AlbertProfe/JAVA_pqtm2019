package com.springbootRestSec3.Services;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;

import com.springbootRestSec3.Mappings.AuthenticatedUser;

public class HttpParserService {
	
	 private long expiration = 3600000;
     private String masterPassword = "superSecretNatalia1234"; 
     private String prefixToken = "Bearer";    
     private String headerHttp = "Authorization";
     private TokenService tokenService;
	
	
	
	public void createToken(HttpServletResponse response , String user) {
		
		String JWT = new TokenService().createToken(user,masterPassword,new Date (System.currentTimeMillis()+expiration));
		response.addHeader(headerHttp, prefixToken + " " + JWT);
	    
		
	}
	
	public Authentication readToken (HttpServletRequest request) {
		
		
		 String token = request.getHeader(headerHttp);
		
		 String actualToken = token.substring(token.indexOf(" ")+1);
		 
		 if (token!=null) {
			 
			 String user = tokenService.readToken(actualToken,masterPassword);
			 if(user!=null) {
				 
				// sercurity part 3
				 return new AuthenticatedUser(user);
			 }
			 
		 }
		 
		 
		return null;
		
	}

}
