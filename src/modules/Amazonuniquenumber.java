package modules;

import java.util.ArrayList;
import java.util.List;

public class Amazonuniquenumber {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		int[] i1= new int[] {4,5,5,5,4,6,6,9,4};
		
		for(int i=0;i<i1.length;i++)
		{
			int k=1;
			if(!list.contains(i1[i]))
			{
				list.add(i1[i]);
				//k++;
			
				for(int j=i+1;j<i1.length;j++)
				{
					if(i1[i]==i1[j])
					{
						k++;
					}
				}
				System.out.println("value of " +i1[i]+ " is present " +k +" times");
			}
		}
			System.out.println(list);
	}	
}
