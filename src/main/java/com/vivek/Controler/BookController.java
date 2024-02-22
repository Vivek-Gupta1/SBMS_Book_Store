package com.vivek.Controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vivek.Repo.BookRepo;
import com.vivek.entity.Book;



@Controller
public class BookController {
	@Autowired
	private BookRepo repo;
	
	@GetMapping("/book")
	public String getBookByID(@RequestParam("id") Integer id, Model model ) {
		
		ModelAndView mv = new ModelAndView();
		Optional<Book> id2 = repo.findById(id);
		if(id2.isPresent()) {
			Book book1 = repo.findById(id).get();
			model.addAttribute("book", book1);
			
		}
		return "index";
	
		
	}

}
