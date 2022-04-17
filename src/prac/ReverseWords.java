package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	
	public void revWords(String b)
	{
		char[] c;
		ArrayList<Character> ch= new ArrayList<>();
		ArrayList<String> ch1= new ArrayList<>();
		
		String[] d=b.split(" ");
		
		for(int i=0;i<d.length;i++)
		{
			c=d[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				ch.add(c[j]);
				//System.out.println(c[j]);
			}
			//System.out.println(ch.toString());
			ch1.add(ch.toString());
			ch.clear();
		}
		System.out.println(ch1);
		
		List<String> al= Arrays.asList(d);
		//System.out.println(al);
		
		Collections.reverse(al);
		
		//System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="I am going to switch at 40LPA";
		ReverseWords rw= new ReverseWords();
		rw.revWords(a);
	}

}
