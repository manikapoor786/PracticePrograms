package modules;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("mani");
		al.add("anju");
		al.add("sheena");
		al.add("deepak");
		
		for(String o:al)
		{
			System.out.println(o);
		}
	}

}
