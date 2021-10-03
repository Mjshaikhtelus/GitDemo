package superKeyword_PracticalUsage;

public class ChildDemoPractical_With_Method extends ParentDemoPractical_With_Method {
	
	
	public void getdata()
	{
		super.getdata();
		System.out.println("I am in child method"); 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemoPractical_With_Method cm =new ChildDemoPractical_With_Method();
		cm.getdata();
		

	}

}
