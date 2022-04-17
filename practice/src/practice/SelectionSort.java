package practice;

public class SelectionSort {
	
	public void selectionSortMethod(int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<(b.length);j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}	
	}

	public static void main(String[] args) {
		
		int a[]= {2,9,1,5,2,7,0,4,5,5,4};
		SelectionSort ss= new SelectionSort();
		ss.selectionSortMethod(a);
	}
}
