package modules;

import java.util.ArrayList;
import java.util.List;

public class StringFilterduplicateElementsUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		
		String[] str1= new String[] {"mexico","france","italy","italy","italy","rance","france","paris"};

		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i]==str1[j])
				{
					if(!list.contains(str1[j]))
					{
						list.add(str1[j]);
					}
				}
			}
		}
		System.out.println(list);
	}

}
