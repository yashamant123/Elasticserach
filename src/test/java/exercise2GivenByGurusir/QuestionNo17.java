package exercise2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;

public class QuestionNo17 {

	public static void main(String[] args) {
	//	17.	input="(())" return true input="((())" return false. 
	//	if String contains matched Open and close brackets return true otherwise return false.

		String str="";
		
	//	System.out.println(strcontainOpenclosecharacters2(str));
		System.out.println(isMatchedBrackets(str));
		
	}

	public static boolean strcontainOpenclosecharacters1(String str) {
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		if(map.get('(') == map.get(')')) {
			
			return true;
		}
		return false;
	}
	
	
	public static boolean strcontainOpenclosecharacters2(String str) {
		
		
		
		int last=str.length()-1;
		
		for(int i=0;i<str.length()/2;i++) {
			
			if(str.charAt(i)!='(' && str.charAt(last)!=')') {
				
				return false;
			}
			last--;
			
		}
		
		return true;
	}
	
	public static boolean isMatchedBrackets(String s)
	{
		int count=0;
		for (char c:s.toCharArray())
		{
			if(c=='(')
			{
				count++;
			}
			else if(c==')')
			{
				count--;			
				if(count<0)
				{
					return false;
				}
			}		
		}		
		return count==0;		
	}	
}
