package modules;
public class ReverseNumberAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 23456;
		int number1=0;
		
		while(number!=0)
		{
			number1=number1*10+ number%10;
			number=number/10;	
		}
		System.out.println(number1);
	}
}