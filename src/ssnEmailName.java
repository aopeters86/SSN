import java.util.*;
public class ssnEmailName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char confirm = 'y';
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = input.nextLine();
//		System.out.println("Please enter your last name: ");
//		String lastName = input.nextLine();
//		System.out.println("Please enter your email: ");
//		String email = input.nextLine();
//		System.out.println("Please enter your social security number: ");
//		String ssn = input.nextLine();
		
		name.fn(firstName);
		
	}

}

 class name {
	
	 
	 
	public name(String first, String last, String email, String social, char userconfirm) {
		
		String firstName = first;
		String lastName = last;
		String validEmail = email;
		String SSN = social;
		char confirm  = ' ';
		
		
		
	}
	
	public static void  fn(String first) {
		 
		String validFN = new String(first);	
		char FL = ' ';
		
			for (int i = 0; i < validFN.length(); i++) {
			FL = validFN.toUpperCase().charAt(0);	
		}
			System.out.println(FL + validFN.substring(1, validFN.length())); 
		
	}
	
	
	public static void ln(String last) {
		
	}
	
}
