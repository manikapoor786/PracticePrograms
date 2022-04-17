package amazon;

public class ReverseArrayInSubsetofN {
	
	public void reversewithSubset(int b[], int subset)
	{
		int c[]= new int[9];
		for(int i=0;i<b.length;)
		{
			
			for(int j=2;j>=0;j--)
			{
				c[i]=b[j];
				i++;
			}
			for(int j=5;j>=3;j--)
			{
				c[i]=b[j];
				i++;
			}
			for(int j=8;j>=6;j--)
			{
				c[i]=b[j];
				i++;
			}
			break;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		
		int a[]= {3,4,5,9,2,3,3,4,1};
		
		ReverseArrayInSubsetofN ra= new ReverseArrayInSubsetofN();
		int subset=3;
		ra.reversewithSubset(a,subset);

	}

}
