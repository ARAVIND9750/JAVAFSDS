public class myexception {class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
	   }
	}


}
