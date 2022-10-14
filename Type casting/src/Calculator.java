<<<<<<< HEAD
    import java.util.Scanner;
	public class Calculator {
	   public static void main(String[] args) {
	      double num1;
	      double num2;
	      double ans;
	      char op;
	      Scanner reader = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = reader.nextDouble();
	      num2 = reader.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	   }
	}
=======
    import java.util.Scanner;
	public class Calculator {
	   public static void main(String[] args) {
	      double num1;
	      double num2;
	      double ans;
	      char op;
	      var reader = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = reader.nextDouble();
	      num2 = reader.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	   }
	}
>>>>>>> f12ebc7d867fbb6611443cae6d502830e7ea0695
