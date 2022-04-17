package stringPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 646454;
		if(num<0)
		{
			System.out.println("not a prime number");
		}
		else
		{
			for(int i=2;i<Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					System.out.println("not a prime number");
				}
			}
			System.out.println("prime number");
		}
	}

}
