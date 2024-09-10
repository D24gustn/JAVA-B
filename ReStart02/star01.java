package ReStart02;

import java.util.Scanner;

public class star01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
		}
	}
}
//나중에 한번 살펴만 볼 것