package com.springbootRest;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

	@RequestMapping("/library")
	public String showBooks(Model model) {
	
		return "books/library";
	}
	
	
	
	
}