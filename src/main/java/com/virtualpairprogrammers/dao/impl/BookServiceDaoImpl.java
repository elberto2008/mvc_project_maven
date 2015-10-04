package com.virtualpairprogrammers.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;

import static org.apache.commons.logging.LogFactory.getLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

import com.virtualpairprogrammers.dao.interfaces.BookServiceDaoInterface;
import com.virtualpairprogrammers.data.BookNotFoundException;
import com.virtualpairprogrammers.domain.Book;

@Repository("bookServiceDao")
public class BookServiceDaoImpl implements BookServiceDaoInterface 
{
	private final static Log log = getLog(BookServiceDaoImpl.class);

	@Autowired
	private JpaTemplate template;

	
	@SuppressWarnings("unchecked")
	public List<Book> getAllBooksByAuthor(String author) 
	{
		return template.find("select book from Book as book where book.author = ?", author);

	}

	
	public List<Book> getAllRecommendedBooks(String userId) 
	{

		return null;
	}

	
	public List<Book> getBookByIsbn(String isbn) throws BookNotFoundException 
	{

		return null;
	}

	
	@SuppressWarnings("unchecked")
	public List<Book> getEntireCatalogue() 
	{

		return template.find("select book from Book as book");

	}

	
	public void registerNewBook(Book newBook) 
	{
		template.persist(newBook);
	}

	
	public Book getBookById(int id) 
	{

		return template.find(Book.class,id);
	}

	
	@SuppressWarnings("unchecked")
	public List<Book> searchBooksByLooseMatch(String chars) 
	{
		log.info(" \n\n\n\n\n\n I am in here searchBooksByLooseMatch ");
		log.info(" \n\n\n\n\n\n I am in here searchBooksByLooseMatch ");
		log.info(" \n\n\n\n\n\n I am in here searchBooksByLooseMatch ");
		return template.find("select book from Book as book where book.author like %"+chars+"%");
	}

}
