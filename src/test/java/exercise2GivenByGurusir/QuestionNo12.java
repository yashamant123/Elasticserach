package exercise2GivenByGurusir;

public class QuestionNo12 {

	public static void main(String[] args) {

		//		12.	Given char array [a,b,b,c,d,f]
		//				a.	given value k
		//				b.	return first element that occurs in this array k times
		//				c.	k=2 return b
		//				d.	k=3 return anything
		//				e.	k=1 return a


		char [] arr= {'b','b','b','c','d','f'};
      
		int k=1;
		char c=charoccurance1(arr,k);
		System.out.println(c);
	}

	public static char charoccurance1(char[] arr, int count) {

		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c==count) {
				return arr[i];
			}
		}
		return '0';
	}

}
