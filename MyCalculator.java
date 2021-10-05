package week2.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int add = cal.add(1, 2, 3);
		System.out.println(add);
		int sub = cal.sub(88, 88);
		System.out.println(sub);
		double mul = cal.mul(23.41, 6.66);
		System.out.println(mul);
		float div = cal.divide(34.5555f, 45.6666f);
		System.out.println(div);

	}

}
