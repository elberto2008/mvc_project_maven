package com.virtualpairprogrammers.dao.impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;

import static org.apache.commons.logging.LogFactory.getLog;

import org.springframework.stereotype.Repository;

import com.virtualpairprogrammers.dao.interfaces.BookServiceDaoInterface;
import com.virtualpairprogrammers.data.BookNotFoundException;
import com.virtualpairprogrammers.domain.Book;

@Repository("bookServiceDao")
public class BookServiceDaoImpl implements BookServiceDaoInterface 
{
	private final static Log log = getLog(BookServiceDaoImpl.class);


	
	@PersistenceContext
	private EntityManager template;

	
	@SuppressWarnings("unchecked")
	public List<Book> getAllBooksByAuthor(String author) 
	{
		return template.createQuery("select book from Book as book where book.author = :author")
				.setParameter("author", author)
				.getResultList();


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

		return template.createQuery("select book from Book as book").getResultList();

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
		return template.createQuery("select book from Book as book where book.author like %:chars")
				.setParameter("chars", chars).getResultList();
	}

}
