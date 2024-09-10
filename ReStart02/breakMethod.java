package ReStart02;

import java.util.Scanner;

public class breakMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int b = 0;

		do {
			System.out.println("숫자를 입력하세요");

			int a = sc.nextInt();
			if (a % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하시겠습니까?(계속하려면 1, 중지하려면 0을 입력하세요):");
			b = sc.nextInt();
		} while (b == 1);
		System.out.println("프로그램이 종료되었습니다.");

	}

}
