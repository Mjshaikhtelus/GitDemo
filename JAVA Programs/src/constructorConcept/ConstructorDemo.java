package constructorConcept;

public class ConstructorDemo {
	
	//contructor is like a method but unlike method constructor will not
	//return any values.
	//name of constructor should be always classname only.
	
	public ConstructorDemo() //this is a default constructor
	{
		System.out.println("I am in the Constructor");
		System.out.println("I am also in the Constructor");
		
	}

	public ConstructorDemo(String s)//this is a parameterized constructor
	{
		System.out.println("I am also the parameterized Constructor");
	}
	
	public ConstructorDemo(int a,int b)//this is also a parameterized constructor
	{
		System.out.println("I am in the parameterized Constructor");
	}
	
	//when an object of class is created automatically set of 
	//codes in constructor body will get executed
	
	public void getdata()
	{
		
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//what is constructor- when an object is created a block 
		//of code is executed
		
		ConstructorDemo dc=new ConstructorDemo();
		ConstructorDemo pc=new ConstructorDemo(6,9);
		ConstructorDemo psc=new ConstructorDemo("hello");
		
		
		

	}

}
