package exercise2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QuestionNo11 {

	public static void main(String[] args) {
		// 11.	WAP to remove duplicates from the given array without using set
		
		int[] arr= {1,1,1,3,2,2,2,2,0,0,0};
		removeDupliactesUsingList2(arr);
		
	}
	
	public static void removeDupliactesUsingList1(int[] arr)
	{
		
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<Integer> dupList=new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			
			if(!dupList.contains(list.get(i)))
			{
				dupList.add(list.get(i));
			}			
		}
		System.out.println(dupList);
	}
	
	
	public static void removeDupliactesUsingList2(int[] a)
	{
		List<Integer> list1=Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> list=new ArrayList<Integer>();	
		for (int i = 0; i < list1.size(); i++) {						
			if(!list.contains(a[i]))
			{
				list.add(a[i]);
			}				
		}
		System.out.println(list);
	}

	public static int[] removeDuplicatesusingset3(int [] arr) {
		
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		
		Set<Integer> set=new HashSet<>(list);
		int[] ar=new int[set.size()];
		int ind=0;
		for(int i: set) {
			
			ar[ind++]=i;
		}
		
		return ar;
		
	}

}
