package com.virtualpairprogrammers.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.services.interfaces.BookService;




@Controller
@RequestMapping("/addNewBook")
public class CreateNewBookController 
{
	@Autowired
	private BookService bookService; 
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView show()
	{
		return new ModelAndView("add-new-book", "book",new Book());
		
	}

	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView createBook(@Valid Book book, Errors result )
	{
		 
		if (result.hasErrors())
		{
			return new ModelAndView("add-new-book","book",book);
		}
		bookService.registerNewBook(book);
		return new ModelAndView("book-added","title",book.getTitle());
		
	}

}
