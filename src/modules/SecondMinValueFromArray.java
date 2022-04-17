package modules;

public class SecondMinValueFromArray {
	int max=0;
	public void secmin(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					arr[i]=arr[j];
				}
			}
		}
		max=arr[0];
		System.out.println(max);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i] && arr[j]<max)
				{
					arr[i]=arr[j];
				}
			}
		}
		System.out.println(arr[0]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,1};
		SecondMinValueFromArray sm= new SecondMinValueFromArray();
		sm.secmin(arr);
	}

}
