package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] charstr=str.toCharArray();
		
		for (int i = 0; i < charstr.length; i++) {
			if (charstr[i]=='e') {
				count++;
		
			}
			
		}
		System.out.println(count);
	}

}
