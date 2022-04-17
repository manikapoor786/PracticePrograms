package amazon;

public class CountNumOccurences {
	
	public void numOccurence(int b[],int element)
	{
		int flag=0;
		for(int i=0;i<b.length;i++)
		{
			if (b[i]==element)
			{
				flag++;
			}
		}
		System.out.println("element is"+" "+element +" "+"and number of occurences are"+" " +flag);
	}

	public static void main(String[] args) {
		
		int a[]= {3,4,5,9,2,3,3,4,1,9};
		CountNumOccurences co= new CountNumOccurences();
		int element=1;
		co.numOccurence(a,element);
	}

}
