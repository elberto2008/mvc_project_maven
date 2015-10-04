package com.virtualpairprogrammers.domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cart")
@Scope("session")
public class ShoppingCart implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private List<Book> shopping = new ArrayList<Book>();

	
	
	public void addItem(Book newItem)
	{
		this.shopping.add(newItem);
	}
	
	public List<Book> getAllItems()
	{
		return shopping;
	}
	
	public void clear() 
	{
		this.shopping.clear();
	}
	
	public List<Book> getShopping() {
		return shopping;
	}

	public void setShopping(List<Book> shopping) {
		this.shopping = shopping;
	}

	public void deleteItem(int id)
	{
		Book bookToRemove = new Book();
		
		for (Book nextBook : this.shopping)
		{
			if(nextBook.getId() == id)
				bookToRemove = nextBook;
		}
		this.shopping.remove(bookToRemove);
	}
}
