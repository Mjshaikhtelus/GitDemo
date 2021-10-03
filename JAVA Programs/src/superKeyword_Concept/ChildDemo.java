package superKeyword_Concept;

public class ChildDemo extends ParentDemo{
	
	String name="An Enginner";

	//same variable in parent and child class when collide
	//it gives preferences to child class variable
	
	
	public void getStringdata()
	
	{
	
		System.out.println(name);
		
		//but in a condition where we need the property of parent variable in
		//child class the we need to use "super" keyword.
		System.out.println(super.name);
		
		
	}
	
	//same variable in parent and child class when collide
	//it gives preferences to child class variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd=new ChildDemo();
		cd.getStringdata();
		
		
	}

}
