package constructoroverload;

public class Book {
	int id;
	String author;
	String title;
	float price;
	
	//default constructor
	public Book()
	{
		id=0;
		author="abc";
		title="xyz";
		price=0.0f;	
	}
	
	//parameterized constructor
	public Book(int id, String author, String title, float price)
	{
		this.id=id;
		this.author=author;
		this.title=title;
		this.price=price;
	}
	
	//parameterized constructor in java and in cpp this is copy constructor
	public Book(Book b)
	{
		this.id=b.id;
		this.author=b.author;
		this.title=b.title;
		this.price=b.price;
	}
	
	void dispBook()
	{
		System.out.println("Id: "+id);
		System.out.println("Author: "+author);
		System.out.println("Title: "+title);
		System.out.println("Price: "+price);
	}
}
