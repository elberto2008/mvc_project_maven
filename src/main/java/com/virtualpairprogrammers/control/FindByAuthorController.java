package com.virtualpairprogrammers.control;

import java.util.List;
import static org.apache.commons.logging.LogFactory.getLog;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.services.interfaces.BookService;

@Controller
public class FindByAuthorController 
{
	@Autowired
	private BookService bookService;
	
	public static final Log log = getLog(FindByAuthorController.class);
	
	@RequestMapping("/findByAuthor")
	public ModelAndView findByAuthor(@RequestParam("author") String nameAuthor)
	{
		
		List<Book> books = bookService.getAllBooksByAuthor(nameAuthor);
		return new ModelAndView("displayAllBooks","allBooks",books);
		
	}
	
	@RequestMapping("/looseSearch")
	public @ResponseBody List<Book> looseSearch(@RequestParam("CHARS") String chars)
	{
		
		log.info("\n\n\n\n\n\n\n\n\n\n\n\n\n\n I AM IN LOG FOR J ");
		
		if (chars.length() < 3)
			return null;
		
		return bookService.getEntireCatalogue();
		
	}


}
