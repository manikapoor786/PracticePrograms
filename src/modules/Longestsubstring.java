package modules;

import java.util.LinkedHashMap;

	public class Longestsubstring {
	 
		    public void longestSubstring(String inputString)
		    {
		    	int longestsubstringsize = 0;
		    	
		    	String longestsubstring = null;
		    	
		        char ch[] = inputString.toCharArray();
		        
		        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		        
		        for(int i=0;i<ch.length;i++)
		        {
		        	if(!map.containsKey(ch[i]))
		        	{
		        		map.put(ch[i], i);
		        	}
		        	else
		        	{
		        		i= map.get(ch[i]);
		        		map.clear();
		        	}
		        	if(map.size() > longestsubstringsize)
		        	{
		        		longestsubstringsize = map.size();
		        		longestsubstring = map.keySet().toString();
		        	}
		        }
		        System.out.println(longestsubstringsize +", " +longestsubstring);
		    }
		     
		    public static void main(String[] args) 
		    {   
		    	Longestsubstring ls= new Longestsubstring();
		    	ls.longestSubstring("sheenam");
		    }
		}
