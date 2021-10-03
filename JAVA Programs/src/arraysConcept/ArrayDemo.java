package arraysConcept;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array-is a container which stores multiple value of same data type
		//Array can be Declare or Initialize in 2 ways
		//1. int a[] = new int[];
		//2. int b[5]= {4,3,6,2,5};
		
		int a[]=new int[5];
		a[0]=4;
		a[1]=3;
		a[2]=6;
		a[3]=2;
		a[4]=5;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[]= {10,8,9,1,5};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		
	}

}
