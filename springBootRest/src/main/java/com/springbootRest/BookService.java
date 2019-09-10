package com.springbootRest;




import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	
	public Iterable<Book> findAll() {
		
		return repository.findAll();
	}
	
	public void insertBook(Book book) {
		
		repository.save(book);
	}
	
	public void deleteBook(Book book) {
		
		repository.delete(book);
	}

}



