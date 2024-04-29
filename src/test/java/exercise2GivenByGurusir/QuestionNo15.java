package exercise2GivenByGurusir;

public class QuestionNo15 {
	//15.first repetitive letter from the given string String input="abcddeff". return 'd'
	public static void main(String[] args) {
		
		String input="abBcddeff";
		System.out.println(FirstRepeatedChar(input));
	}

	
	public static char FirstRepeatedUsingLoops(String s)
	{
		//s=s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {			
			int count=0;
			for (int j = 0; j < s.length(); j++) {				
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
				}				
			}
			if(count>1)
			{
				return s.charAt(i);
			
			}
		}
		return 0;
		}
	
	public static char FirstRepeatedChar(String s)
	{
		char[] a=s.toCharArray();
		int count=1;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==a[i+1])
			{
				count++;
			}
			
			if(count>1)
				return a[i];
		}
		return '0';
		
	}
	
}
