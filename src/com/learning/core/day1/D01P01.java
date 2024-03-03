package com.learning.core.day1;

class Book
{
	public String book_title;
	public double book_price;
	public void set(String name,double money)
	{
		this.book_title = name;
		this.book_price = money;
	}
	public String gettitle()
	{
		return this.book_title;
	}
	public double getprice()
	{
		
		return this.book_price;
	}
	
}

public class D01P01
{
	public static Book createBooks()
	{
		Book b = new Book();
		return b;
	}
	public static void showBooks(Book b)
	{
		b.set("Java Programming",350.00);
		System.out.print("Book Title:"+b.gettitle()+" and Price: "+b.getprice());
	}
	public static void main(String[]args)
	{
		showBooks(createBooks());
	}
}