package inheritancePractiseProblem;

public class ClassB extends ClassA{
	
	int s=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB p=new ClassB();
		System.out.println(p.s);
		
		ClassA q=new ClassB();
		System.out.println(q.s);
		

	}

}
