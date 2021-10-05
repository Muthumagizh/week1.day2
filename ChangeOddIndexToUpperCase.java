package week2.day2;

import java.lang.*;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charstring=test.toCharArray();
		for (int i = 0; i < charstring.length; i++) {
			if (i%2==0) {
				charstring[i]=Character.toUpperCase(charstring[i]);
				System.out.println(charstring[i]);
			}
			else {
				System.out.println(charstring[i]);
			}
		}
	}
}
