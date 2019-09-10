package com.springbootRestSec2.Services;

import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenService {

	
	public String createToken(String user,String passwordEncode,Date expiration) {
		
		
		String JWT = Jwts.builder()
		         .setSubject(user)
		         .setExpiration(expiration)
		         .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encodeToString((passwordEncode.getBytes())))
		         .compact();
			
			return JWT;
		
	}
	
	
	public String readToken(String token, String passwordEncode) {
		
		String user = Jwts.parser()
		     .setSigningKey( Base64.getEncoder().encodeToString((passwordEncode.getBytes())))
		     .parseClaimsJws(token)
		     .getBody()
		     .getSubject();
		return user;
	}
	
}
