package amazon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintfirstfinalOccurence {
	public void printfirstfinal(int b[], int num)
	{
		List<Integer> list= new ArrayList<Integer>();
		List<Integer> list1= new ArrayList<Integer>();
		for(int i=0;i<b.length;i++)
		{
			list.add(b[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		for(int i:list)
		{
			if(i==num)
			{
				list1.add(i);
			}
		}
		int l=list1.size();
		System.out.println(list1.get(0));
		System.out.println(list1.get(l-1));
	}

	public static void main(String[] args) {
		int a[]= {1,2,4,1,6,8,8,0,1,3,4};
		int num=8;		
		PrintfirstfinalOccurence pf = new PrintfirstfinalOccurence();
		pf.printfirstfinal(a, num);
	}
}