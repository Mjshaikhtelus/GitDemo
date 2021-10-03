package function_OR_method_overloading;

public class Method_OverloadingConcept {
	
	//method overloading is a class having multiple method with same name 
	//but different arguments/parameters means
	//Either argument/parameters count should be different 
	//or argument/parameters return type that data type should be different.
	
	
	
	public void getdata(int a)
	{
		
		System.out.println(a);
		
	}
	
	public
	void getdata(String a)
	{
	System.out.println(a);	
	}

	public void getdata(int a, int b)
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_OverloadingConcept mo=new Method_OverloadingConcept();
		
		mo.getdata(2);
		mo.getdata("hello");
		mo.getdata(5,3);
				
		
	}

}
