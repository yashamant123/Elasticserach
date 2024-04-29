package exercise2GivenByGurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionNo10 {

	public static void main(String[] args) {

		//10.	Count the no.of occurences each digit in given array [1,1,1,3,2,2,2,2,0,0,0]

		int a[]= {1,1,1,3,2,2,2,2,0,0,0};
		countoccurancewithoutusingHashmap3(a);

	}

	public static Map<Integer,Integer> countoccurenceusingHashMap1(int a[]){

		Map<Integer,Integer> map= new HashMap<>();

		for(int i=0;i<a.length;i++) {

			if(map.containsKey(a[i])) {

				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}

		return map;
	}

	public static Map<Integer,Integer> countoccurenceusingHashMap2(int a[]){

		Map<Integer,Integer> map= new HashMap<>();

		for(int i=0;i<a.length;i++) {

			map.put(a[i], map.getOrDefault(a[i], 0)+1);

		}

		return map;
	}

	public static void countoccurancewithoutusingHashmap3(int a[]) {
		
		List<Integer> dup=new ArrayList<>();
		  for(int i=0;i<a.length;i++) {
			  
			  int count =1;
			  if(!dup.contains(a[i])) {
			  for(int j=i+1;j<a.length;j++) {
				  
				  if(a[i]==a[j]) {
					 
					  count++;
				  }
			  }
			  System.out.println("digit is "+a[i]+" : "+ "count is : "+count);
			  }
			  dup.add(a[i]);
			 
		  }
	}
}
