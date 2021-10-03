package cpm.print_withoutloop;

public class Print_1_TO_10_withoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printwithoutLoop(1);

	}

	public static void printwithoutLoop(int n)
	{
		
		if(n<=10)
		{
			System.out.println(n);
			
			printwithoutLoop(n+1);
		}
		
		
	}
}
