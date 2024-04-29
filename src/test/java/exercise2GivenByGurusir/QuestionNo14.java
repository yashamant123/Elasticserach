package exercise2GivenByGurusir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionNo14 {

	public static void main(String[] args) {
	
//		14.Search particular character in the given string 
//		a.String = "Manjusha"
		
		String str="Manjusha";
		
		char c='M';
		searchCharacterUsingList3(str,c);

	}

	public static String searchCharacterByindexOf1(String str,char c) {
		
		if(str.indexOf(c)==-1) {
			
			return "Test is Failed";
		}
		
		return "Test is Passed";
	}
	
	public static String searchCharacter2(String s,char c)
	{
		char[] a=s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==c)
			{
				return "Test Passed";
			}
			
		}
		return "Test Failed";
	}
	
	public static void searchCharacterUsingList3(String s,char c)
	{
		char[] a=s.toCharArray();
		List<Character> list=new ArrayList<>();
		for(char ch:a)
		{
			list.add(ch);
		}
		if(list.contains(c))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");			
		}
	}
	
	public static boolean searchCharacterUsingcount4(String s, char c) {
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==c) {
				count++;
			}
			
		}
		if(count==0) {
			return false;
		}
		return true;
		
	}
}
