package cpm.print_withoutloop;

public class Reverse_EachWord_InSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My Name Is Khan";
		String revString="";
		
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revWord="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				
				revWord=revWord+word.charAt(j);

				
			}
			
			revString=revString+revWord+" ";
			
		}
		
		System.out.println(revString);
			
			
		
	}

}
