package prac;

public class Fizzbuzz {
	
	public void fizzbuzz()
	{
		for(int i=1;i<101;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}

	  static public void main(String[] args) {
		
		Fizzbuzz fb= new Fizzbuzz();
		fb.fizzbuzz();
	}
}
