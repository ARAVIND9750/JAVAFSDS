import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Emailvalidation {
public static void main(String[] args) {

	String[] a= {"aravind@gmail.com","aravind5@gmail.com","aravind4@gmail.com","aravind3@gmail.com","aravind2@gmail.com","aravind1@gmail.com"};
	 String k;
	 Scanner email =new Scanner(System.in);
	 System.out.println("Please enter email:");
	 k=email.nextLine();
	 List<String> w =Arrays.asList(a);
	 boolean result = w.contains(k);
	 if(result)
		 System.out.println("email is validated");
	 else
		 System.out.println("please enter correct email");
	  
	}
}