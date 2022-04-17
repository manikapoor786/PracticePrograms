package modules;

public class First2MaxValuesFromArray {

	public void deleteFirst2MaxValues(int a[])
	{
		int max=0;
		int max2=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			System.out.println(max);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>max2 && a[j]<max)
				{
					max2=a[j];
				}
			}
			System.out.println(max2);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,2,3,2,3,5,7};
		First2MaxValuesFromArray del= new First2MaxValuesFromArray();
		del.deleteFirst2MaxValues(a);
	}

}
