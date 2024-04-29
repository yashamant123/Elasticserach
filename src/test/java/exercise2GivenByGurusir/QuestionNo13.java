package exercise2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QuestionNo13 {

	//13.Find the duplicate character in the given String "abcdedef"
	public static void main(String[] args) {

		String str="abcdedef";
		
		dupliacteCharacterUsingHashMap(str);
	}

	public static void dupliacteCharacterUsingHashMap(String s)
	{

		s=s.toLowerCase();
		Map<Character,Integer> m=new HashMap<>();

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
			}
			
		}
		for(Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}


	public static Map<Character,Integer> dupliacteCharacterUsingLoops(String s)
	{
		Map<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				map.put(s.charAt(i),count);
			}
		}
		return map;
	}
	public static String duplicatechars(String str) {
		
		StringBuilder r=new StringBuilder();
		
		return str;
		
	}

}
