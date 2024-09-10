package ReStart02;

import java.util.Scanner;

public class star03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i <= a; i++) {
			for (int j = a; i <= j; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//조금 다시 보기