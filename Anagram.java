package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()==text2.length()) {
			System.out.println("lenghth equal");
		}
		char[] chartext1=text1.toCharArray();
			Arrays.sort(chartext1);
			System.out.println(chartext1);
			char[] chartext2=text2.toCharArray();
			Arrays.sort(chartext2);
			System.out.println(chartext2);
		
			int Comparearray = Arrays.compare(chartext1,chartext2);
			System.out.println(Comparearray);
				if (Comparearray==0) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
			}
	
	}


