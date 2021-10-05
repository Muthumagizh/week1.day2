package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"	 	 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
String Value="madam";
String RevValue="";
for (int i = Value.length()-1; i >= 0; i--) {
	RevValue=RevValue+Value.charAt(i);
	
}
if(Value.equalsIgnoreCase(RevValue)) {
	System.out.println("palindrome");
	
}
else {System.out.println("Not-palindrome");
	
}

	}

}
