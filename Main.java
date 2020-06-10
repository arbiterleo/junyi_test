package junyi_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		//test and show the result
		System.out.println(Q1_A("junyiacademy"));
		
		System.out.println(Q1_B("flipped class room is important"));
		
		System.out.println(Q2(15));
	}
	
	public static String Q1_A(String target)
	{
		String result = "";
		
		//reverse the string
		for(int i = (target.length()-1); i >= 0; i --)
		{
			result += target.charAt(i);
		}
		
		return result;
	}
	
	public static String Q1_B(String target)
	{	
		String result = "", resultset[];
		
		//split into several string
		resultset = target.split(" ");
		
		//reverse each string
		for(int i = 0; i < resultset.length; i++)
		{
			String temp = resultset[i];
			temp = Q1_A(temp) + " ";
			
			resultset[i] = temp;
			temp = null;
		}
		
		//combine all strings into one
		for(String s : resultset)
		{
			result += s;
		}
		return result;
	}
	
	public static int Q2(int target)
	{
		int result = 0;
		List<Integer> resultset = new ArrayList<Integer>();
		
		//list all numbers below the target
		for(int i = 1; i <= target; i ++)
		{
			resultset.add(i);
		}
		
		Iterator<Integer> iterator = resultset.iterator();
		while(iterator.hasNext())
		{
			int temp = iterator.next();
			
			//only count towards the number that meet the conditions
			if(temp % 3 == 0 && temp % 5 ==0)
			{
				result += 1;
				//System.out.println(temp); 測試用
			}
			else if(temp % 3 != 0 && temp % 5 != 0)
			{
				result += 1;
				//System.out.println(temp); 測試用
			}
		}
		return result;
	}

}
