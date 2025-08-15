package constructoroverload;

public class Main
{
     public static void main(String[] args) 
	{
		Book obj1= new Book();//default constructor
		Book obj2 = new Book(1,"Let us c","Y.P.Kanetkar",250.0f);
	    Book obj3 = new Book(obj2);

	obj1.dispBook();
	obj2.dispBook();
	obj3.dispBook();
    }

}
