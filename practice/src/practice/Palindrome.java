package practice;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=12321;
		int sum=0;
		int remainder=0;
		
		while(num!=0)
		{
			remainder=num%10;
			num=num/10;
			sum=sum*10 + remainder;
		}
		 num=12321;
		System.out.println(sum);
		System.out.println(num);
		
		if(num==sum)
		{
			System.out.println(+num+ " is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
