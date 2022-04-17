package modules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_stringUsingCollections {

	public static void main(String[] args) {
		
		String[] str= {"mani","kapoor","anju","deepak","sheenam"};
		
		List<String> list= Arrays.asList(str);
		
		Collections.sort(list);
		
		System.out.println(list);

	}
}
