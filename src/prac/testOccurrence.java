package prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testOccurrence {
	
	public void test1()
	{
		List<Integer> al= Arrays.asList(2,4,5,1,2,3,4);//need to check how we can pass the array from main method instead of directly hardcoding here
		Set<Integer> s= new HashSet<>(al);
		for(Integer m:s)
		{
			System.out.println(m+ " times " +Collections.frequency(al, m));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {2,5,7,1,2,9,2,3,1};
		testOccurrence to= new testOccurrence();
		to.test1();
	}
}
