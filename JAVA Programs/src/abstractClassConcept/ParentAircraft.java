package abstractClassConcept;

public abstract  class ParentAircraft {

	//if a class has any method with out body then that class will automaticall
	//became abstract class
	
	//Abstract class acheive partial abstraction
	//since it has both abstract method as wel as non abstract method
	
	//Interface acheive 100% abstruction by hiding the implementation details
	
	//Access modifier of method in Abstruct class cannot be private.
	
	//Abstruct class cannot be instantiate means object creation not allowed 
	public void engine()
	{
		System.out.println("Follow Engine GuideLines");
	}
	
	public void SafetyGuideLines()
	{
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void Bodycolour();
	
	
	
	
}
