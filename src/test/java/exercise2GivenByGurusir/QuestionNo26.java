package exercise2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class QuestionNo26 {

	/*
	 * 26.String s1 = "abababcde"
    if the above string contains duplicates characters return true else return false
    Write 3 approaches and each time reduce the number of iterations
	 */
	@Test
	void m1() {
		String s1 = "aabcd";
		System.out.println(findDub(s1));
	}
	public boolean findDub(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
}
