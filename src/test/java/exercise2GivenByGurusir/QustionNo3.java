package exercise2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QustionNo3 {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		
		list.addAll(Arrays.asList("Jayesh","Tirumala","Vasanth","Kavitha","Vasanth","Tirumala"));		
		System.out.println(list);
//		Set<String> set=new HashSet<>(list);
//		System.out.println(set);

		List<String> Uniquelist=new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			int count=0;
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j)))
				{
					count++;
				}			
			}
			if(count==1)
			{
				Uniquelist.add(list.get(i));
			}
			
		}
		System.out.println(Uniquelist);
	}
	
	

}
