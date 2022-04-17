package practice2;

public class SmallestNumberMultiDim {

	public int[][] smallest(int b[][])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				if (b[i][j]>b[i][j+1])
				{
					b[i][j]=b[i][j+1];
				}
			}
		}
		return b;
		
	}
	
	public static void main(String[] args) {
		
		int a[][]=  {{1,2,3},{9,6,9}};
		SmallestNumberMultiDim snm= new SmallestNumberMultiDim();
		
		System.out.println(snm.smallest(a));
		
	}

}
