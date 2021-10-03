package arraysConcept;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 
		
		int a[][]=new int[2][3];
		
		a[0][0]=3;
		a[0][1]=6;
		a[0][2]=9;
		a[1][0]=2;
		a[1][1]=4;
		a[1][2]=8;
		
		System.out.println(a[0][2]);
		
		//another and simplest way to declare multi dimentional array is
		
		int b[][]= {{3,6,9},{2,4,8}};
		
		System.out.println(b[1][1]);
		
		
		
		
		
	}

}
