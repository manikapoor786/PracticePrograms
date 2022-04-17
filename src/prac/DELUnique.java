package prac;

import java.util.ArrayList;

public class DELUnique {
	ArrayList<Integer> al= new ArrayList<>();
	
	public void unique(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println("count for"+" "+a[i]+" "+"is"+" "+count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DELUnique d= new DELUnique();
		int a[]= {2,3,4,2,3,5,6,6,9};
		d.unique(a);
	}

}
