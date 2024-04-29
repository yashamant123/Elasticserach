package exercise1GivenByGurusir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionNo20 {

	public static void main(String[] args) {
		//		20.	Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
		//				a.	[1,3,6,8,9] target= 3 return the index of 3 
		//				b.	target = 7 return the index if target will be inserted in the array (sorted)
				
		int[] arr= {1,3,6,8,9};

		int target=5;

		System.out.println(getIndexOfTargetvalue1(arr, target));
	}

	public static int getIndexOfTargetvalue1(int[] arr, int target) {

		for(int i=0;i<arr.length;i++) {

			if(arr[i]==target || arr[i]>target) {

				return i;
			}
		}
		return arr.length;
	}

	public static int getIndexOfTargetvalue2(int[] arr, int target) {

		List<Integer> list=new ArrayList<>();
		for(int i: arr) {

			list.add(i);
		}


		if(list.contains(target)) {
			return list.indexOf(target);
		}else if(!list.contains(target)){
			Collections.sort(list);
			if(target>list.get(list.size()-1)) {
				return list.size();
			}else  {

				for(int i=0;i<list.size();i++) {

					if(target<list.get(i)) {

						return i;
					}
				}

			}
		}

		return 0;
	}
}
