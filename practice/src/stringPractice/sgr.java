package stringPractice;

import java.util.ArrayList;

public class sgr {
	
	public void filterDuplicate(int b[])
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					if(!al.contains(b[i]))
					al.add(b[i]);
				}
			}	
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sgr s= new sgr();
		int a[]= {1,4,2,9,1,1,4,6,2};
		s.filterDuplicate(a);
	}

}
