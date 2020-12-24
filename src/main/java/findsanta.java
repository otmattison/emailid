
import java.util.*;
public class findsanta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		Scanner input = new Scanner(System.in);
		suspects s = new suspects(5);
		
		//Hard coded a string array of 5 emails
		s.addSusspect("bob@gmail.com");
		s.addSusspect("sara@gmail.com");
		s.addSusspect("tom@gmail.com");
		s.addSusspect("joe@gmail.com");
		s.addSusspect("matt@gmail.com");
		
		//print out the array of emails
		System.out.println("this is a small list of 5 emails");
		s.printSuspects();
		
		System.out.println("Enter in the email you want to search for ");
		//take in user input of an email
		String inputSearch = input.nextLine();
		
		//return boolean statement for compared string
		boolean foundMatch = s.foundMatch(inputSearch);
		
		if (foundMatch) {
			System.out.println(inputSearch + " is a email in an array");
		} else {
			System.out.println(inputSearch + " is not found");
		}
		
		
		
		
	}

}
