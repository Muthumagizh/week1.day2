package week2.day2;

public class LearnStringArray {

	public static void main(String[] args) {
String str="Welcome to test leaf";
char[] charArray = str.toCharArray();
int count1=0;
for (int i = 0; i < charArray.length; i++) {
	if (charArray[i]=='e') {
		
		count1++;
		
	}
	
}
System.out.println(count1);
	}

}
