package com.springbootRest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookService {

	RestTemplate template = new RestTemplate();

	public Iterable<Book> findAll() {

		ResponseEntity<List<Book>> response = template.exchange("http://localhost:8080/webapi/books", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Book>>() {
				});

		List<Book> personas = response.getBody();
		return personas;
	}

	public void insertBook(Book book) {

		HttpEntity<Book> request = new HttpEntity<>(book);
		template.postForObject("http://localhost:8080/webapi/books", request, Book.class);
	}

	public void deleteBook(Book book) {

		template.delete("http://localhost:8080/webapi/books/" + book.getTitle());
	}

}
