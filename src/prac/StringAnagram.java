package prac;

import java.util.HashSet;

public class StringAnagram {
	String p="";
	HashSet<Character> hs= new HashSet<>();
	public void revWords(String a)
	{
		char[] ch=a.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			hs.add(ch[i]);
		}
		System.out.println(hs.toString());
		
		for(Character c:hs)
		{
			p+=c;
		}
		System.out.println(p);
	}

	public static void main(String[] args) {
		String a="maneesh";
		StringAnagram rw= new StringAnagram();
		rw.revWords(a);
	}
}
