package com.springbootRestSec2.Test;



import static org.junit.Assert.*;
import org.junit.Test;

import com.springbootRestSec3.Services.TokenService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;





public class TokenTest {

	@Test
	public void testCreateToken() throws ParseException {
		
		TokenService service = new TokenService();
		DateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		String token = service.createToken("natalia", "superSecretNatalia1234", formater.parse("01/06/2019"));
		
		assertEquals("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXRhbGlhIiwiZXhwIjoxNTU5MzQwMDAwfQ.LPumLysbce7_zVnF1IOJz-3DU3Qf6S3Rw1yTEVsqL88",token);
		
	}
	
	@Test
	public void testReadTokenUsuer() {
		
		
		TokenService service = new TokenService();
		String user = service.  readToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXRhbGlhIiwiZXhwIjoxNTU5MzQwMDAwfQ.LPumLysbce7_zVnF1IOJz-3DU3Qf6S3Rw1yTEVsqL88", "superSecretNatalia1234");
		assertEquals("natalia65",user);
	}

}