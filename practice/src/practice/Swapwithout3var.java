package practice;

public class Swapwithout3var {

	public static void main(String[] args) {
		
		int num1=123;
		int num2=456;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println(+num1 +" & "+ +num2);

	}

}
