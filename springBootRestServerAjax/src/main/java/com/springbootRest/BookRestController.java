package com.springbootRest;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
@CrossOrigin(origins = "http://localhost:8081", methods={RequestMethod.GET,RequestMethod.POST})
public class BookRestController {

	@Autowired
	BookRepository repository;

	@GetMapping("/books")
	public Iterable<Book> findAll() {

		return repository.findAll();
	}
	@PostMapping(path="/books", consumes="application/json")
	public void insertBook(@RequestBody Book book) {

		repository.save(book);
	}
	
	@DeleteMapping("/books/{title}")
	public void deleteBook(@PathVariable String title) {
		
		Optional<Book> book =repository.findById(title);
		
		if (book.isPresent()) {
			repository.delete(book.get());
			
		}
		
	}

}
