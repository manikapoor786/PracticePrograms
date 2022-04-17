package modules;

public class starPattern {
	public void star()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=4;j>i;j--)
			{	
				System.out.print(" ");	
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		starPattern sp = new starPattern();
		sp.star();
	}
}