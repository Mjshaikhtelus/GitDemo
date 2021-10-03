package function_OR_Method_overriding;

// In OverRidding both the method have same name ,same Parameters/Argument
// or signature.

public class MethoD_Overriding_Child_Class extends Method_Overriding_Parent_Class{
	
	public void header()
	{
		System.out.println("header deep blue colour is implemented");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethoD_Overriding_Child_Class db=new MethoD_Overriding_Child_Class();
		
		db.header();

	}

}
