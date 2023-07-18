/*두 정수 a, b를 입력받아 다음 조건들이 각각 참인지 거짓인지를 판단하는 프로그램을 작성해보세요.
a가 b보다 같거나 큰가?
a가 b보다 큰가?
b가 a보다 같거나 큰가?
b가 a보다 큰가?
a와 b가 같은가?
a와 b가 다른가?
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다. 각각의 경우에 대해 참이라면 1을, 거짓이라면 0을 출력합니다.
1 ≤ a, b ≤ 100  */

import java.util.Scanner;

public class Ex_092 {
	public static void main(String[] args) {
		System.out.println("정수 a, b를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if (a >= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a <= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a < b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a == b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a != b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}