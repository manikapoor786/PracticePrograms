package modules;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FilterDuplicateUsingCollectionsFrequency {
	
	public void filterduplicateElements(String a[])
	{
		ArrayList<String> al= new ArrayList<>();
		Collections.addAll(al, a);
		for(String s:al)
		{
			System.out.println(s+" = " +Collections.frequency(al, s)+" times");
		}
		
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		for(int i=0;i<a.length;i++)
		{
			hm.put(a[i], i);
		}
		System.out.println(hm.keySet());
	}

	public static void main(String[] args) {
		String a[]= {"3","5","7","9","1","3","3","5","5","7","9"};
		FilterDuplicateUsingCollectionsFrequency del= new FilterDuplicateUsingCollectionsFrequency();
		del.filterduplicateElements(a);
	}
}
