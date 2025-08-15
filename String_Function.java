package string;

public class String_Function {

	public static void main(String[] args) {
		
		String S1 = "Profound"; //literal
		String S2 = new String("Nasik"); //object
		
		char ch = S1.charAt(2);
		System.out.println(ch);
		int l =S2.length();
		System.out.println("Length = "+l);
		
		System.out.println("sub String = "+S1.substring(4));
		System.out.println("sub String = "+S1.substring(2,6));
		boolean b= S2.contains("sik");
		System.out.println(b);
		
		S1=S1.replace('o','x');
		System.out.println(S1);
		String S3= S1.concat(S2);
		System.out.println(S3);
		
		String str =" nasik";
		System.out.println(S2.equals(str));
		System.out.println(S2.equalsIgnoreCase(str));
		
		S1=S1+" Collage Road";
		System.out.println(S1);
		String str2 = "Softcrowd";
		System.out.println(str2.indexOf('o'));
		System.out.println(str2.lastIndexOf('o'));
		
		String t= "profound";
		String t2= "SOFTCROWD";
		System.out.println(t.toUpperCase());
		System.out.println(t2.toLowerCase());
		
		String mystr = "   This is demo Class    ";
		System.out.println(mystr);
		System.out.println(mystr.length());
		mystr = mystr.trim();
		System.out.println(mystr);
		System.out.println(mystr.length());
		
		
			

	}

}
