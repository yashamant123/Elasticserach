package exercise2GivenByGurusir;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class QuestionNo1 {

	public static void main(String[] args) {

	//	duplicaterpersonnames1();
	  randomPersonName();
		
	}
	
	
	public static void duplicaterpersonnames1() {
		
		Set<String> firstname=new HashSet<>();
		Set<String> lastname=new HashSet<>();

	//	Set<String> duplicatenames=new HashSet<>();

		Map<String, String> personname=new HashMap<>();

		firstname.addAll(Arrays.asList("Tirumala","Vasanth","Jayesh","Yashmant","Srikar"));

		lastname.addAll(Arrays.asList("Kadiyam","Kumar","Jayesh","Gouda","Srikar"));

		for(String str1 : firstname) {

			for(String str2 : lastname) {

				if(str1.equals(str2)) {
					//duplicatenames.add(str1);
					personname.put(str1, str2);
				//	break;
				}
			}
		}

		for(Entry<String,String> set : personname.entrySet())
		{
			System.out.println("firstname  : "+set.getKey() + " lastname : " +set.getValue());
		}
		
	}
	
	
	public static void randomPersonName()
    {
        String[] firstNames= {"Kavita","Suresh","Debarati","Ankita","Karthik"};//5
        String[] lastNames= {"Hiremath","Anand","Jana","Patnaik","Vempalli"};//5
        
        Set<String> generateNames=new HashSet<>();
        
        Random rd=new Random();
        int generatedNo=40;
        
        for(int i=0;i<generatedNo;i++)
        {
            String fName=firstNames[rd.nextInt(firstNames.length)];//firstNames[4]
            String lName=lastNames[rd.nextInt(lastNames.length)];//
            String fullName=fName+" "+lName;
            System.out.println(fullName);
            if(generateNames.contains(fullName))
            {
                System.out.println("Duplicates :"+fullName);
            }else
            {
                generateNames.add(fullName);
            }
        }
        
    }
	
	

}
