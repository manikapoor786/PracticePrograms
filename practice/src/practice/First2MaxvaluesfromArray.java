package practice;

import java.util.Arrays;

public class First2MaxvaluesfromArray {
	
	public void maxValue()
	{
		int a[]= {2,5,9,33,1,45};
		int firstvalue= a[0];
		
		for(int i=1;i<a.length;i++)
		{
				if(a[i]>firstvalue)
				{
					firstvalue=a[i];
				}
		}
		System.out.println(firstvalue);
		
		int secondValue=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>secondValue && a[i]<firstvalue)
			{
				secondValue=a[i];
			}
		}
		System.out.println(secondValue);
	}
	
	public static void main(String[] args) {
		First2MaxvaluesfromArray f2= new First2MaxvaluesfromArray();
		f2.maxValue();
	}
}
