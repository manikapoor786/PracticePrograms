package modules;

import java.util.HashSet;

public class SetcollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs= new HashSet<String>();
		hs.add("mani");
		hs.add("mummy");
		hs.add("mummy");
		
		for(String o:hs)
		{
			System.out.println(o);
		}
	}

}
