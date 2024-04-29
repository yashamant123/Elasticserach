package exercise2GivenByGurusir;

import java.util.Arrays;

public class QuestionNo6 {

	public static void main(String[] args) {

		
		


	}

	public static void ByUsingThirdvariable() {
		int[] numbers= {25,3,6,7,8,9,9};
		System.out.println("Before Sorting array is "+Arrays.toString(numbers));
		int temp=0;
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println("After Sorting array is "+Arrays.toString(numbers));
	}
	
	public void ByWithoutUsingThirdvariable() {
		int[] numbers= {25,3,6,7,8,9,9};
		System.out.println("Before Sorting array is "+Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					numbers[i]=numbers[i]+numbers[j];
					numbers[j]=numbers[i]-numbers[j];
					numbers[i]=numbers[i]-numbers[j];
				}
			}
		}
		System.out.println("After Sorting array is "+Arrays.toString(numbers));
	}

	
}
