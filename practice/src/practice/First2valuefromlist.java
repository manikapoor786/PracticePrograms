package practice;

public class First2valuefromlist {
 
	public void fetchMax2values(int b[])
	{
		int largestnum=0;
		int secondLargest=0;
		int thirdlargest=0;
		
		for(int n:b)
		{
			if(largestnum < n)
			{
				secondLargest=largestnum;
				largestnum=n;
			}
			else if(secondLargest < n)
			{
				secondLargest=n;
			}
			else if(thirdlargest<n)
			{
				thirdlargest=n;
			}
		}
		System.out.println(largestnum);
		System.out.println(secondLargest);
		System.out.println(thirdlargest);
	}
	

	public static void main(String[] args) {

		int a[]= {2,5,21,43,21,14};
		First2valuefromlist f2= new First2valuefromlist();
		f2.fetchMax2values(a);
		
	}
}
