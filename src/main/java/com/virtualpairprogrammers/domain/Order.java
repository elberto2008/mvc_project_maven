package com.virtualpairprogrammers.domain;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order implements Serializable 
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	
	@OneToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST })
	private Customer customer;
	
	private boolean giftWrap;
	
	@ManyToMany(cascade={CascadeType.PERSIST})
	private List<Book> booksOrdered;


	public Order()
	{
		this.customer = new Customer();
	}
	
	public void removeItem(int id)
	{
		Iterator<Book> it = booksOrdered.iterator();
		while (it.hasNext())
		{
			Book next = it.next();
			if (next.getId() == id)
			{
				it.remove();
			}
		}
	}
	
	public void setBooksOrdered(List<Book> booksOrdered) 
	{
		this.booksOrdered = booksOrdered;
	}
	public void setCustomer(Customer customerDetails) 
	{
		this.customer = customerDetails;
	}
	
	public List<Book> getBooksOrdered() 
	{
		return booksOrdered;
	}
	public Customer getCustomer() 
	{
		return customer;
	}
	public boolean isGiftWrap() 
	{
		return giftWrap;
	}
	public void setGiftWrap(boolean giftWrap) 
	{
		this.giftWrap = giftWrap;
	}
	
	public String toString()
	{
		return "Order id for " + customer.getFirstName();
	}
	
	public void clear() 
	{
		this.booksOrdered.clear();
	}
	
	
}
