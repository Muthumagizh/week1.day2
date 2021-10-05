package week2.day2;

import java.lang.*;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] chartest = test.toCharArray();
		for (int i = 0; i < chartest.length; i++) {

			if (Character.isLetter(chartest[i]) == true) {

				letter++;
			} else if (Character.isSpaceChar(chartest[i]) == true) {
				space++;
			} else if (Character.isDigit(chartest[i]) == true) {
				num++;
			} 
			else {
				specialChar++;
			}

		}
		System.out.println(letter);
		System.out.println(space);
		System.out.println(num);
		System.out.println(specialChar);
		
	}

}
