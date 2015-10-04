package com.virtualpairprogrammers.domain;

import java.io.Serializable;


public class Address implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private  String street;
	private String zip;
	private String city;
	private String state;
	private String country;
	
	
	//Cons
	
	public Address() 
	{
		super();
	}
	public Address(String street, String zip, String city, String state,
			String country) 
	{
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
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
	public String getStreet()
	{
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
	public String getCity() {
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
	
	

}
