package modules;

public class ArrayDemo {
	
	public void arraycheck(int a[], int value)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
			{
				System.out.println("value is present");
				break;
			}
			else
			{
				System.out.println("value is not present");
			}
		}
	}

	public static void main(String[] args) {
		int value=6;
		int a[]= {2,5,4,1,6,8};
		ArrayDemo at= new ArrayDemo();
		at.arraycheck(a, value);
	}
}
