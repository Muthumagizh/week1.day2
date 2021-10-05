package week2.day2;

public class LearnAddandCheckArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,9,8,7,6};
		int target=9;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i]+arr[j]==target) {
					System.out.println("Pair "+arr[i]+" "+arr[j]);
					
				}
				
			}
			
		}

	}

}
