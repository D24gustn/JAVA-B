package ReStart01;

import java.util.Scanner;

public class JavaProgramming03 {
	static double PI = 3.14;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름 입력: ");
		
		double a = sc.nextDouble();
		
		System.out.println("원의 넓이는 " + PI * a * a  + "입니다" );
		System.out.printf("원의 넓이는 %.2f cm입니다.\n",(PI * a * a));
	}

}
