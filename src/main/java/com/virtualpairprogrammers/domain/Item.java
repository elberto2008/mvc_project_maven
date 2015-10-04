package com.virtualpairprogrammers.domain;

public class Item 
{
	private Book book;
	int quantity;
	
	
	public Item() 
	{
		super();
	}
	
	
	public Item(Book book, int quantity) 
	{
		super();
		this.book = book;
		this.quantity = quantity;
	}




	public Book getBook() 
	{
		return book;
	}
	public void setBook(Book book) 
	{
		this.book = book;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
}
