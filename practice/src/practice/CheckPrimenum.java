package practice;

public class CheckPrimenum {

	public static void main(String[] args) {
		
		int num=4746465;
		
		if(num<=1)
		{
			System.out.println("not a prime number");
		}
		else
		{
			for(int i=2;i<Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					System.out.println(+num+ "is prime number");
				}
				else
				{
					System.out.println(+num+ "is not a prime number");
				}
			}
		}

	}

}
