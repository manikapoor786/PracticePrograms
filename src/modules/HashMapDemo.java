package modules;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public void practiceMap()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		hm.put(1, "mani");
		hm.put(2, "sheena");
		hm.put(3, "mummy");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo mp= new HashMapDemo();
		mp.practiceMap();
	}

}
