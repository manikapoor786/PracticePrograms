package modules;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=37;
		int flag=0;
		
		if(number<1)
		{
			System.out.println("It is not a prime number");
		}
		
		else 
		{
			for(int i=2;i<Math.sqrt(number);i++)
			{
				if(number%2==0)
				{
					flag=0;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(number + ""+" is a prime number");
			}
		}

	}

}
