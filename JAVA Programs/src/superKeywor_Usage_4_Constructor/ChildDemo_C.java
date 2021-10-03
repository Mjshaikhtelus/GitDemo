package superKeywor_Usage_4_Constructor;

public class ChildDemo_C extends ParentDemo_C{
	
	public ChildDemo_C()
	{
	 
		
		super(); 
		System.out.println("I am in child Constructor");
		
		//super(); // in constructor when we want to use parent constructor 
		//in child class then "super() keyword should be written
		//on the first line in child constructor.
		
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo_C cc=new ChildDemo_C();
		

	}

}
