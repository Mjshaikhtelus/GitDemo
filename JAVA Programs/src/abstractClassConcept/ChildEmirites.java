package abstractClassConcept;

public class ChildEmirites extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirites cf=new ChildEmirites();
		cf.Bodycolour();
		cf.engine();
		cf.SafetyGuideLines()
		;
		
		//Abstruct class cannot be instantiate means object creation not allowed 
		// ParentAircraft cp=new ParentAircraft();
		

	}

	@Override
	public void Bodycolour() {
		System.out.println("Red");
		
	}

}
