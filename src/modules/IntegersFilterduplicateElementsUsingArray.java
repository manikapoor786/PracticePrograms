package modules;

import java.util.ArrayList;

public class IntegersFilterduplicateElementsUsingArray {
	ArrayList<Integer> al= new ArrayList<Integer>();
	
	public void dupElements(int n[])
	{
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					if(!al.contains(n[i]))
					al.add(n[i]);
				}
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		
		int n[]= {1,7,2,3,1,9,7};
		IntegersFilterduplicateElementsUsingArray del= new IntegersFilterduplicateElementsUsingArray();
		del.dupElements(n);

	}

}
