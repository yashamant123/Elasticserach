package exercise2GivenByGurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class QuestionNo19 {

	public static void main(String[] args) {
		//19.	Given an array of (1,2,3,4,5,2) and find the no of occurrences in an unsorted array

	}

	public static Map<Integer,Integer> elementsappearnotimes1(int [] arr, int k) {

		Map<Integer,Integer> map= new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {

			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

		}
		
		return map;

	}
}
