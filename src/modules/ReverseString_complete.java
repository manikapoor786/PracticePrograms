package modules;

import java.util.ArrayList;

public class ReverseString_complete {
	
	String st="";
	public void withBuffer(String str)
	{
		StringBuffer buffer= new StringBuffer(str);
		buffer.reverse();
		System.out.println(buffer);
	}
	
	public void withoutBuffer2(String str)
	{
		char[] ch= str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			st= st+ str.charAt(i);		
		}
		System.out.println(st);
	}
	
	public void withoutBuffer(String str)
	{
		char ch[]= str.toCharArray();
		ArrayList<Character> al= new ArrayList<Character>();
		for(int i=ch.length-1;i>=0;i--)
		{
			al.add(ch[i]);
		}
		System.out.println(al);
	}
	
	public void stringBuilder(String str)
	{
		StringBuilder out= new StringBuilder();
		
		char[] ar=str.toCharArray();
		for(int i=ar.length-1;i>=0;i--)
		{
			 out.append(ar[i]);	 
		}
		System.out.println(out.toString());
	}

	public static void main(String[] args) {
		
		String s="sheenam";
		ReverseString_complete rs= new ReverseString_complete();
		rs.withBuffer(s);
		rs.withoutBuffer(s);
		rs.withoutBuffer2(s);
		rs.stringBuilder(s);
	}
}
