package exceptions;
@SuppressWarnings("serial")

public class ProperAge {
	public static void main(String[] args) {
		  String name= args[0];
		  int age = Integer.parseInt(args[1]);
		  try {
		   if(age<18 || age>=60)
		    throw new InvalidAgeException("Invalid Age");
		   System.out.println("Name= "+ name+ "  = "+ age);
		  }
		  catch(InvalidAgeException e) {
		   System.out.println(e);
		  }
		 }
		}
		class InvalidAgeException extends Exception{
		 public InvalidAgeException(String age) {
		  super(age);
		 }
		}

