package exercise2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class QuestionNo30 {

	/*
	 * 30.String str="internet chrome safari opera";
		Write approaches to get the below output:
		Output is like that..intenet -1  chrome-1 safari-1 opera-1
	 */
	@Test
	void m1() {
		String str="internet chrome safari opera safari";
		String[] splitStr = str.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<splitStr.length;i++) {
			map.put(splitStr[i], map.getOrDefault(splitStr[i],0)+1);
		}
		System.out.println(map);
	}
	
}
