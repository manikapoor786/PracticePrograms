package prac;

public class NumberPalindrome {
	int sum=0;
	
	public void palindrome(int n)
	{
		while(n>0)
		{
			int rem= n%10;
			n=n/10;
			sum= sum*10+ rem;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 2345;
		NumberPalindrome np= new NumberPalindrome();
		np.palindrome(n);

}
}
