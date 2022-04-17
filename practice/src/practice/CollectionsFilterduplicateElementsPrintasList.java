package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsFilterduplicateElementsPrintasList {

	public static void main(String[] args) {
		
		//ArrayList<String> list= new ArrayList<String>(Arrays.asList("manish","rishav","satpal","pushpak","rishav","manish"));
		ArrayList<String> list= new ArrayList<String>();
		
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
					list.add(a[i]);	
				}	
			}
		}
		System.out.println(list);
	}

}
