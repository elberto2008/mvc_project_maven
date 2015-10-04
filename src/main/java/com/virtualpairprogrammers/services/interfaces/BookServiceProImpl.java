package com.virtualpairprogrammers.services.interfaces;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtualpairprogrammers.dao.interfaces.BookServiceDaoInterface;
import com.virtualpairprogrammers.domain.Book;
@Transactional
@Service("bookService")
public class BookServiceProImpl implements BookService
{
	@Autowired
	private BookServiceDaoInterface booServiceDao;

	public List<Book> getBookByIsbn(String isbn) 
	{
		return null;
	}

	public List<Book> getEntireCatalogue() 
	{
		return booServiceDao.getEntireCatalogue();

	}

	public void registerNewBook(Book newBook) 
	{
		booServiceDao.registerNewBook(newBook);
	}

	public List<Book> getAllBooksByAuthor(String author) 
	{
		return booServiceDao.getAllBooksByAuthor(author);
		
	}

	public void deleteBookFromStock(Book bookToRemove) 
	{
	}

	public Book getBookById(int id)
	{
		return booServiceDao.getBookById(id);
		
	}

	
	public List<Book> getAllRecommendedBooks(String userId) 
	{
		throw new java.lang.UnsupportedOperationException();
	}


	public List<Book> searchBooksByLooseMatch(String chars) 
	{
		return null;
		
	}

}
