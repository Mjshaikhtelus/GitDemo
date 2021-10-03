package classes_Object_inJava;

public class MainClass_Calling_Reusable_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Navigate to main page");
		
		ClassofReusableMethod m=new ClassofReusableMethod();
		
		m.HeaderValidations();
		m.FooterValidations();
		String s=m.ImageValidations();
		System.out.println(s);		
		
				

	}

}
