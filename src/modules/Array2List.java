package modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= new String[] {"mani","kapu","rish"};
		
		List<String> list= new ArrayList<String>();
		
		list= Arrays.asList(str);
		System.out.println(list);
	}

}
