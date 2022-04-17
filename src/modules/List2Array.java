package modules;

import java.util.Arrays;
import java.util.List;

public class List2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list= Arrays.asList("mani","anju","deepak","sheenam");
		System.out.println(list);
		
		String[] str= list.toArray(new String [list.size()]);
		System.out.println(Arrays.toString(str));
		
	}

}
