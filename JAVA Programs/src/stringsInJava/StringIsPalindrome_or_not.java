package stringsInJava;

public class StringIsPalindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev="";
		String s="madam";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
	
		}
        System.out.println(rev);
        
        if(rev.contentEquals(s))
        {
        	System.out.println("String is Palindrome");	
        }
        else
        {
        	
        	System.out.println("String is not Palindrome");	
        	
        }
        
        

	}

}
