package thisKeyword_Concept;

public class This_Keyword {
	
	int a=2;
	
	public void getdata()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		
		//this keyword refers to current object and object scope lies 
		//in class level
		//if we need to add value of same global and local variable
		//then below is useful
		
		int sum =a+this.a;
		System.out.println(sum);
		
	}
	
	//here we declare same variable "a" globally that is on class level
	//and also declared a as local variable on method level
	//in some condition if we need to access global variable on 
	// method level then we need to use "this" keyword

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This_Keyword tk=new This_Keyword();
		
		tk.getdata();
	}

}
