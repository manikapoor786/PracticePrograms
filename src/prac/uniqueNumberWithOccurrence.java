package prac;

import java.util.ArrayList;

public class uniqueNumberWithOccurrence {

	public void uniqueOccurrence(int a[])
	{
		
		ArrayList<Integer> al= new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			int k=1;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i] +" is present "+k +" times");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,3,2,4,2,3,2,3};
		uniqueNumberWithOccurrence un= new uniqueNumberWithOccurrence();
		un.uniqueOccurrence(a);
	}

}
