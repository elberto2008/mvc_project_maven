package com.virtualpairprogrammers.services.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtualpairprogrammers.dao.interfaces.AccountServiceDaoInterface;
import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.domain.Customer;
import com.virtualpairprogrammers.domain.Order;

@Transactional
@Service("accountsService")
public class AccountsServiceProImpl implements AccountsService
{	
	@Autowired
	private AccountServiceDaoInterface accountDao;
	
	public void raiseInvoice(Book requiredBook) 
	{
		System.out.println("Raised the invoice for " + requiredBook);
	}

	
	public Customer findCustomer(String login, String password) throws CustomerNotFoundException 
	{
		return accountDao.findCustomer(login, password);
		
	}

	
	public void createCustomer(String login, String email, String password,
			String firstName, String lastName, String street, String zip,
			String city, String state, String country) {
		
		accountDao.createCustomer(login, email, password, firstName, lastName, street, zip, city, state, country);
	}

	
	public void saveCustomerOrder(Order order) 
	{
		accountDao.saveCustomerOrder(order);
	}
}
