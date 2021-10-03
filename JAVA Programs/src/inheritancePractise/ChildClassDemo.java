package inheritancePractise;

public class ChildClassDemo extends ParentClassDemo{
	
	public void Engine()
	{
		System.out.println("new Engine");
	}

	public void colour()
	{
		System.out.println(colour);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassDemo cd= new ChildClassDemo();
		cd.colour();
		cd.gear();
		cd.brakes();
		cd.AudioSystem();
		

		
		
		
		
	}

}
