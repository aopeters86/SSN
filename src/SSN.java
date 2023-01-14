import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//--Plan of attack--
		//--VALIDATE SSN-- 
		//check ssn valid = 123-45-6789;
		//check if 11 digits
		//check for (-) at position 3 and 6
		//check if the char is digit or letter
		//--full send to console--

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		String ssn1String = input.nextLine();
		input.close();
		
		//character that if uppercase in the character location of string
		
		
				
		//Check string length if not equal to 11, invalid		
		if(ssn1String.length() !=11){
			System.out.println(ssn1String +" is an invalid social security number");
			System.exit(0);
			}
		
		//check for '-' dash at char 3 		
		if(ssn1String.charAt(3)!='-')  {	
			System.out.println(ssn1String + " is an invalid social security number");
			System.exit(0);
			}
		
		//check for '-' dash at char 6		
		if(ssn1String.charAt(6)!='-')  {	
			System.out.println(ssn1String + " is an invalid social security number");
			System.exit(0);
			}
		
		//character that if uppercase in the character location of string
		char c0 = Character.toUpperCase(ssn1String.charAt(0));
		char c1 = Character.toUpperCase(ssn1String.charAt(1));
		char c2 = Character.toUpperCase(ssn1String.charAt(2)); 
		char c4 = Character.toUpperCase(ssn1String.charAt(4));
		char c5 = Character.toUpperCase(ssn1String.charAt(5));
		char c7 = Character.toUpperCase(ssn1String.charAt(7));
		char c8 = Character.toUpperCase(ssn1String.charAt(8));
		char c9 = Character.toUpperCase(ssn1String.charAt(9));
		char c10 = Character.toUpperCase(ssn1String.charAt(10));
		
		
		//else conditions equal programmed conditions print valid to console
		if(Character.isDigit(c0 & c1 & c2 & c4 & c5 & c7 & c8 & c9 & c10)) {
				System.out.println(ssn1String + " is a valid social security number");
				System.exit(0);
				}
	
		//if any other conditions, print invalid
		else {
			System.out.println(ssn1String + " is an invalid social security number");
			System.exit(0);
			}
		}
	}


