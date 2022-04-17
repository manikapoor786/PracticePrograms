package practice;

public class LinearSearch {
	
	public void methodLinear(int b[], int element)
	{
		int j=0;
		for(int i:b)
		{
			j++;
			if (i==element)
			{
				System.out.println("keyelement is found " +i+ " and position is "+(j-1));
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		int a[]= {3,8,1,2,9,2,4};
		int keyelement=9;
		
		LinearSearch ls= new LinearSearch();
		ls.methodLinear(a,keyelement);
	}

}
