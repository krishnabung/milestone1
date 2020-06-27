package exceptions;
class InvalidCountryException extends Exception {
	InvalidCountryException()
	{
	super();
	System.out.println("InvalidCountryException occured");
	System.out.println("User Outside India  cannot be registered");
	}

}
public class userregistration {
	
	void registerUser(String username, String userCountry) throws InvalidCountryException{
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userregistration registration = new userregistration();
		
		try {
			registration.registerUser("Mickey", "US");
		} catch (InvalidCountryException e) {
			System.out.println("catch block executed");
		}
	}

}