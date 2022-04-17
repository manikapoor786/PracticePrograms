package prac;

public class ArrayReverse {

	public void arrayReverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,2,3,5,7,8};
		ArrayReverse ar= new ArrayReverse();
		ar.arrayReverse(a);
	}

}
