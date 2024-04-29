package exercise2GivenByGurusir;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QustionNo4 {

	public static void main(String[] args) {

		int [] arr= {3,4,6,9,2,2,5,5};
		int [] newarr=removeDuplicatesusingSet(arr);

	//	System.out.println("after reomoving duplicates : "+ Arrays.toString(newarr));
		removeDup2(arr);
	}

	public static int[] removeDuplicatesusingSet(int [] arr) {

		System.out.println("Before reomoving duplicates : "+ Arrays.toString(arr));

		Set<Integer> set=new HashSet<Integer>();

		for(int i : arr) {

			set.add(i);
		}
		int [] newarr=new int[set.size()];
		int ind=0;
		for(int i : set) {

			newarr[ind++]=i;
		}
		//System.out.println("After reomoving duplicates : "+Arrays.toString(set.toArray()));
		return newarr;
	}



	public static void removeDup2(int[] arr)
	{
		
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==(arr[j]))
				{
					count++;
				}			
			}
			if(count==1)
			{
				System.out.print(arr[i]+",");
			}
		}
	}
}

