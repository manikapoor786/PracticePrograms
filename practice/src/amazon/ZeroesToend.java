package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZeroesToend {
	
	public void moveZeroatEnd(int b[])
	{
		List<Integer> al= new ArrayList<Integer>();
		for(Integer in:b) {
			al.add(in);
		}
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
	}

	public static void main(String[] args) {
		
		int a[]= {0,4,0,9,0,3,3,4,1,0};
		
		ZeroesToend ze= new ZeroesToend();
		ze.moveZeroatEnd(a);
	}

}
