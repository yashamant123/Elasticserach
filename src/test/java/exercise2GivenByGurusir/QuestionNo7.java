package exercise2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionNo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 5, 7, 9, 9, 1};
	//	missingNumberByUsingCollection();
		
		int n=10;
		
		System.out.println(missingNum2(arr,n));

	}

	public void missingNumber() {
		int[] arr = { 1, 5, 7, 9, 9, 1, 20 };// dublicates
		int[] sortedArray = QuestionNo7.removeDuplicatesusingSet(arr);
		System.out.println(Arrays.toString(sortedArray));
		int start = sortedArray[0];
		for (int i = 0; i < sortedArray.length - 1; i++) {
			int temp = sortedArray[i] + 1;
			while (temp < sortedArray[i + 1]) {
				System.out.println(temp);
				temp++;
			}
		}
	}
	
	public static void missingNumberByUsingCollection() {
		int[] arr = { 1, 5, 7, 9, 9, 1, 20 };// dublicates
		Arrays.sort(arr);
		List<Integer> list=new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
		}
		int min=list.get(0);
		int max=list.get(list.size()-1);
	
		for (int i = min; i < max; i++) {
			if(!list.contains(i)) {
				System.out.printf(i+" ");
			}

		}
		
	}
	
	public static int missingNum2(int[] arr,int n)
	{
		
	       // int n=arr.length;
	        int sum1=(n*(n+1))/2;
	        int sum2 = 0;
	        for(int i=0;i<arr.length;i++)
	        {
	          sum2+=arr[i];
	        }
	        return sum1-sum2;
	    
	}

	public static int[] removeDuplicatesusingSet(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			set.add(i);
		}
		int[] result = new int[set.size()];
		int index = 0;
		for (int j : set) {
			result[index] = j;
			index++;
		}
		Arrays.sort(result);
		return result;
	}

}
