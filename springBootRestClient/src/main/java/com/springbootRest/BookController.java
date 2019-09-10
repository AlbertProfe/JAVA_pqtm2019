package com.springbootRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService service;
	
	@RequestMapping("/library")
	public String showBooks (Model model) {
		
			
		model.addAttribute("library", service.findAll());
		return "books/library";
	}

      @RequestMapping("/newBook")
	public String newBook() {
		
		
		return "books/newBook.html";
	}
	
	@RequestMapping("/insertBook")
	public String insertBook (Book book, Model model) {
		
		service.insertBook(book);
		model.addAttribute("library",service.findAll());
		
		return "books/library.html";	}
	
	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam("title") String title, Model model) {
		
		Book book = new Book(title);
		
		service.deleteBook(book);
		model.addAttribute("library",service.findAll());
		
		return "books/library.html";
	}

}
