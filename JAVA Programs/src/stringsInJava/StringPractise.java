package stringsInJava;

public class StringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Payment $100 paid
		
	//There are 2 ways to declare string class in java
		//1 is String literal String s="Payment $100 paid";
		//2 is by using new keyword(new is a memory allocation operator
		//String s= new String
		//("Payment $100 paid");
		
		String s="Payment $100 paid";
		System.out.println(s.charAt(8));
		
		String s1=new String("Payments $100 paid");
		System.out.println(s1.charAt(8));
		System.out.println(s1.substring(8));
		
		
		
	}

}
