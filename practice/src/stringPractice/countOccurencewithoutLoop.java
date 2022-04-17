package stringPractice;

public class countOccurencewithoutLoop {

	static int countString(char ch, String s) {
		if (s.length() == 0)
		{
			return 0;
		}
		
		int count = 0;
		
		if (s.charAt(0) == ch)
		{
			count++;
		}
		count += countString(ch, s.substring(1));
		return count;
	}

	public static void main(String[] args) {
		String str = "sheenam";
		char c = 'e';
		System.out.println(countString(c, str));
	}
}
