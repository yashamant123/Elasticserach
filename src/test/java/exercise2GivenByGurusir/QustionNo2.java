package exercise2GivenByGurusir;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QustionNo2 {

	public static void main(String[] args) {
		
		int [] arr= {3, 1, 2, 3, 4, 5};
		
	   Arrays.sort(arr);
		Random r=new Random();
		int no=r.nextInt(arr[arr.length-1]);
		System.out.println("Random no : " +no);
		removeRandomno(arr, no);
		
	}

	public static void removeRandomno1(int [] arr, int no) {
		
		int[] newarr= new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==no) {
				
				
			}
		}
	}
	
	public static void removeRandomno(int[] arr, int no) {
		
	System.out.println("Before removing the value "+ Arrays.toString(arr));
		
		Scanner scan=new Scanner(System.in);
//		int no=scan.nextInt();
		
		int [] newarr=new int[arr.length-1];		
		int ind=0;
		for(int i=0;i<arr.length;i++) {			
			if(arr[i]!=no) {				
				newarr[ind]=arr[i];
				ind++;
			}			
		}
		for(int j=0;j<ind;j++) {
			System.out.print(newarr[j]+" ");
		}
	}
}
