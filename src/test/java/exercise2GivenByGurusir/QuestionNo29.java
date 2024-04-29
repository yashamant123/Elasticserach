package exercise2GivenByGurusir;

import java.util.Arrays;

import org.testng.annotations.Test;

public class QuestionNo29 {

	/*
	 * 29.char ch[]={abc bca adef};

 		Output [a][b][c][%20][b][c][a][%20][a][d][e][f]
	 */
	
	@Test
	public void m1() {
		char[] ch= {'a','b','c',' ','b','c','a',' ','a','d','e','f'};
		String[] result=new String[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				result[i]="["+"%20"+"]";
			}else {
				result[i]="["+ch[i]+"]";

			}
		}
		System.out.println(Arrays.toString(result));
	}
}
