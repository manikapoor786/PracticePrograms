package prac;

public class Delremovespaces {
	String d="";

	public void removeSpaces(String a)
	{
		a=a.replaceAll("\\s", "").trim();
		//System.out.println(a);
	}
	
	public void reversefirstWord(String b)
	{
		//System.out.println(b.replaceFirst("is", "si"));
	}
	
	public void reverseString(String b)
	{
		StringBuffer buffer= new StringBuffer(b);
		buffer.reverse();
		System.out.println(buffer);	
	}
	
	public void revstring(String a)
	{
		String t="";
		for(int i=a.length()-1;i>=0;i--)
		{
			t=t+a.charAt(i);
		}
		//System.out.println(t.replaceAll("\\s", ""));
	}
	
	public void reverseeeword(String b)
	{
		String words[]=b.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "abc de f";
		String b="my name is manish";
		Delremovespaces del= new Delremovespaces();
		del.removeSpaces(a);
		del.reversefirstWord(b);
		del.reverseString(b);
		del.revstring(a);
		del.reverseeeword(b);
	}

}
