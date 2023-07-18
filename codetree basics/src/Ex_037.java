/*정수 a를 입력받고, a에 2를 곱한 뒤 3을 더해 출력하는 프로그램을 작성해보세요.
 1 ≤ a ≤ 100*/

import java.util.Scanner;

public class Ex_037 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		int a = scanner.nextInt();
		//String input = scanner.nextLine();
		//int a = Integer.parseInt(input);

		System.out.println("출력:");
		System.out.printf("%d", a*2+3);

	}

}
