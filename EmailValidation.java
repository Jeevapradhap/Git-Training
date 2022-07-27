package assistedpractice;

import java.util.regex.*;
import java.util.*;

public class EmailValidation {

	public static void main(String[] args) {
		 ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("jeevapradhapj@gmail.com");  
	        emails.add("jeeva.pradhap@gmail.com");  
	        emails.add("jeeva1234@gmail.com");  
	        emails.add("jeev18116.ei@rmkec.ac.in");  
	        emails.add("sashiga1998@gmail.com"); 
	        emails.add("jeeva.ganesan@gmail.com");
	        //Add invalid emails in list  
	        emails.add("@cognizant.com");  
	        emails.add("wipro.com");  
	        //Regular Expression   
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  

	}

}
