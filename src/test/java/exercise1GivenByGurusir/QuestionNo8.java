package exercise1GivenByGurusir;

import java.util.Arrays;

public class QuestionNo8 {

	public static void main(String[] args) {
		//		8.	Move the zero elements to the end of array.
		//		a.	input --> int a []={0,1,2,0,3,0,0};
		//		b.	output--> int a []={1,2,3,0,0,0,0};

		int a []={0,1,2,0,3,0,0};

		System.out.println(Arrays.toString(a));
		int ind=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[ind++]=a[i];

			}
		}
		while(ind<a.length) {

			a[ind++]=0;
		}
		System.out.println(Arrays.toString(a));	
	}

	public static void shiftingzerostoEnd1(int[] a) {

		System.out.println("Before shifting zeros to the end Array values are : "+ Arrays.toString(a));
		int newarr[]= new int[a.length];
		int ind=0;
		for(int i=0;i<a.length;i++) {

			if(a[i]!=0) {
				newarr[ind++]=a[i];
			}
		}

		System.out.println("Before shifting zeros to the end Array values are : "+ Arrays.toString(newarr));
	}
}
