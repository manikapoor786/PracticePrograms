package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortUsingCollections {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>(Arrays.asList("manish","rishav","satpal","pushpak","rishav","manish"));
		Collections.sort(list);
		System.out.println(list);
	}
}
