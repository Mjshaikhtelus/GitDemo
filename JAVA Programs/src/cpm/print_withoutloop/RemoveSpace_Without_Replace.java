package cpm.print_withoutloop;

public class RemoveSpace_Without_Replace {

	public static void main(String[] args) {
		
		String str="Java is a prograaming language";
		
		char[] chars= str.toCharArray();
		
		String str1="";
		
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]!=' ')
			{
			
				//str1=str1+chars[i];
				str1=str1+str.charAt(i);
				
			}
		}
		
		System.out.println(str1);

	}

}
