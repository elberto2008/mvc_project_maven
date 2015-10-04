package com.virtualpairprogrammers.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

import com.virtualpairprogrammers.dao.interfaces.AccountServiceDaoInterface;
import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.domain.Customer;
import com.virtualpairprogrammers.domain.Order;
import com.virtualpairprogrammers.services.interfaces.CustomerNotFoundException;


@Repository("accountServiceDao")
public class AccountServiceDaoImpl implements AccountServiceDaoInterface 
{

	
	@Autowired
	private JpaTemplate template;

	public void raiseInvoice(Book requiredBook) 
	{
		
	}

	
	public Customer findCustomer(String login,String password) throws CustomerNotFoundException 
	{	
		
		@SuppressWarnings("unchecked")
		List<Customer> listCustomer =  template.find("select customer from Customer as customer where customer.login = ? and customer.password = ?",login,password);
		if (listCustomer.size() == 0)
			throw new CustomerNotFoundException();
		else
			return listCustomer.get(0);
	}


	
	public void createCustomer(String login, String email, String password,
			String firstName, String lastName, String street, String zip,
			String city, String state, String country) 
	{
		Customer customer = new Customer(login, password, email, firstName, lastName, street, zip, city, state, country);
		
		template.persist(customer);
		
	}


	public void saveCustomerOrder(Order order) 
	{
		template.merge(order);
	}


}
