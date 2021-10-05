package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] testarray = test.split(" ");
		
		for (int i = 0; i < testarray.length; i++) {
			if (i % 2 != 0) {
				
				int lenth=testarray[i].length();
				
				char[] totestchar = testarray[i].toCharArray();
				
				for (int j = lenth-1; j >= 0; j--) {
				System.out.print(totestchar[j]);
					}
			} 
			else {
				System.out.print(testarray[i]);
				}
			System.out.print(" ");	
		}
				
			
		}
	}