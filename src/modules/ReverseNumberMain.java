package modules;

public class ReverseNumberMain {
	int num=4567, rem=0,sum=0;
	
	public int reverse()
	{
		while(num>0)
		{
		rem= num%10;
		num=num/10;
		sum= sum*10+ rem;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNumberMain r= new ReverseNumberMain();
		int num=r.reverse();
		System.out.println(num);
		
	}

}
