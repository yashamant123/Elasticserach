package exercise1GivenByGurusir;

import java.util.Arrays;

public class QuestionNo9 {

	public static void main(String[] args) {
		// 9.	Sort the given array [2,1,1,0,0,0,3]

		int[] arr= {2,1,1,0,0,0,3};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] sortedArray1(int [] arr) {
		
		Arrays.sort(arr);
		
		return arr;
	}
	
	 static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
}
