package ReStart02;

import java.util.Scanner;

public class star04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int n = 5; n > i; n--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}