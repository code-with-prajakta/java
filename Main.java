package second;
import first.DerivedOne;
import first.NonDerivedOne;

public class Main {
      public static void main(String[] args) {
    	  
    	  DerivedOne d1 = new DerivedOne();
    	  d1.dispBase();
    	  d1.dispDerivedOne();
    	  
    	  NonDerivedOne n1 =new NonDerivedOne();
    	  n1.dispNonDerivedOne();
    	  
    	  System.out.println("=========================");
    	  DerivedTwo d2 = new DerivedTwo();
    	  d2.dispDerivedTwo();
    	  
    	  NonDerivedTwo n2 = new NonDerivedTwo();
    	 n2.dispBase();
		
	}

}
