package practice;

public class ArraysFilterduplicateElementsPrintasList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {"manish","rishav","satpal","pushpak","rishav","manish"};
		String b[]= new String[5];
		
		for(int i=0;i<a.length;i++)
		{
			int p=0;
			for(int j=i+1;j<a.length;j++)
			{
				if( a[i].contentEquals(a[j]))
				{
					p++;
					System.out.println("value of array is"+" " +a[i]+" with count as"+" "+ +(p+1));
					b[i]=a[i];
				}
			}
		}
	}
}
