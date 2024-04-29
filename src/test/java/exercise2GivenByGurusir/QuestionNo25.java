package exercise2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class QuestionNo25 {

	/*
	 * 25.Reverse a string  eg: "Surya"  o/p - ayrus
		Again if you will reverse back to Surya ---- How many iterations it will take.
	 */
	@Test
	void m1() {
		System.out.println(countIteration("surya"));
	}
	int countIteration(String string) {
		int count=0;
		String resultString="";
		for (int i = string.length()-1; i >= 0; i--) {
			resultString=resultString+string.charAt(i);
			count++;
		}
		System.out.println(resultString);

		for (int i = resultString.length()-1; i >= 0; i--) {
			string=string+string.charAt(i);
			count++;
		}
		System.out.println(string);

		return count;
	}
	
	
}
