package com.virtualpairprogrammers.dao.interfaces;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.domain.Customer;
import com.virtualpairprogrammers.domain.Order;
import com.virtualpairprogrammers.services.interfaces.CustomerNotFoundException;

public interface AccountServiceDaoInterface 
{
	public void raiseInvoice(Book requiredBook);
	
	public Customer findCustomer(String login,String password) throws CustomerNotFoundException;
	
	public void createCustomer(	String login,String email,String password,String firstName,String lastName,
			String street,String zip,String city, String state, String country);
	
	public void saveCustomerOrder(Order order);
}
