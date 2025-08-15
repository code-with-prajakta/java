package static_initializer;

public class Employee
 {
   int id;
   String name,city;
   static String company_name;
  
  public Employee(int id,String name)
  {
	  this.id=id;
	  this.name=name;
	  System.out.println("Constructor");
  }
  //instance
  {
	  city="nasik";
	  System.out.println("instance init");
  }
  
  //static
  static
  {
	  company_name = "Softcrowd";
	  System.out.println("staic init");
  }
  
  void dispEmployee()
  {
	  System.out.println("ID: "+id);
	  System.out.println("Nmae: "+name);
	  System.out.println("Company_name: "+company_name);
	  System.out.println("City: "+city);
  }
   
}
