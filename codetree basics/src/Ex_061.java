/*두 개의 정수를 입력받아 곱과 몫을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ b ≤ a ≤ 500
첫 번째 줄에는 두 정수를 곱했을 때의 결과와 식을,
두 번째 줄에는 a에서 b를 나눴을 때의 결과와 식을 출력합니다. */

import java.util.Scanner;

public class Ex_061 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("출력:");
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d", a, b, a/b);
		//System.out.println(a + " * " + b + " = " + a * b);
		//System.out.println(a + " / " + b + " = " + a / b);
	}
}