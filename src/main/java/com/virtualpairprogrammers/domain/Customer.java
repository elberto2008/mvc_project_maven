package com.virtualpairprogrammers.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String login;
	private String email;
	private String password;
	private String passwordConfirmed;
	private String firstName;
	private String lastName;
	private  String street;
	private String zip;
	private String city;
	private String state;
	private String country;

	
	
	//Cons
	public Customer()
	{
		super();
	}

	public Customer(String login, String password,String email, String firstName,
			String lastName,String street, String zip, String city, String state,String country) 
	{
		super();
		this.login = login;
		this.password = password;
		this.email=email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street=street;
		this.city=city;
		this.country=country;
		this.state=state;
		this.zip=zip;
	}

	
	
	//Get and Set

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getLogin() 
	{
		return login;
	}

	public void setLogin(String login) 
	{
		this.login = login;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getZip() 
	{
		return zip;
	}

	public void setZip(String zip) 
	{
		this.zip = zip;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getPasswordConfirmed() {
		return passwordConfirmed;
	}

	public void setPasswordConfirmed(String passwordConfirmed) {
		this.passwordConfirmed = passwordConfirmed;
	}


	
	
	
	
	
	
	
}