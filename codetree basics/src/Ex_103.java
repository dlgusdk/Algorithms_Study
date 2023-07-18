/*정수 a가 주어졌을 때, a가 3의 배수이거나 5의 배수인 경우에는 1을, 그렇지 않다면 0을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a가 주어집니다.
1 ≤ a ≤ 1,000
첫 번째 줄에 a가 3의 배수이거나 5의 배수인 경우에는 1을, 그렇지 않다면 0을 출력합니다 */

import java.util.Scanner;

public class Ex_103 {
	public static void main(String[] args) {
		System.out.println("정수 a의 값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	

		if (a % 3 == 0 || a % 5 == 0) {
			System.out.println("1");
	    } else {
			System.out.println("0");
		}
	}
}