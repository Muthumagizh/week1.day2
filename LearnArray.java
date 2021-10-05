package week2.day2;
import java.util.Arrays;
public class LearnArray {

	public static void main(String[] args) {
		int arr[] = {100,49,398,34,1,267};
		Arrays.sort(arr);
		int length=arr.length;
		System.out.println("Second largest"+arr[length-2]);
		System.out.println("Second smallest"+arr[1]);
		
		

	}

}
