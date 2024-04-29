package exercise1GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//import com.google.common.primitives.Ints;
public class QuestionNo5 {

	public static void main(String[] args) {

		int[] arr= {3,4,5,9,2,11,6};

		// sortArrayusingCollection1(arr);
		sortArrayusingCollection2(arr);

	}

	public static void sortArrayusingCollection1(int []	arr) {

		System.out.println("Before sorting Array : " + Arrays.toString(arr));
		List<Integer> list=new ArrayList<>();
		for(int i : arr) {

			list.add(i);
		}
		Collections.sort(list);

		System.out.println("After sorting Array : " + list);
	}

	public static void sortArrayusingCollection2(int []	arr) {

		System.out.println("Before sorting Array : " + Arrays.toString(arr));
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//List<Integer> list=Arrays.stream(arr).boxed().toList();
		//	List<Integer> list = Ints.asList(arr);
		Collections.sort(list);

		System.out.println("After sorting Array : " + list);
	}
	
	

}
