package modules;

import java.util.HashMap;

public class CountUniqueLettersUsingMap {
	HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
	
	public void countmap(String str)
	{
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			if(!hm.containsKey(c[i]))
			{
				hm.put(c[i], i);
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]==c[i])
				{
					count++;
				}
			}
			System.out.println("Element is "+c[i] +" with number of times present as "+count);
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="maneesh";
		CountUniqueLettersUsingMap dmc= new CountUniqueLettersUsingMap();
		dmc.countmap(str);
	}

}
