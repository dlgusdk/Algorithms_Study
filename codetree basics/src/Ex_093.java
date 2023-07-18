/*두 개의 정수를 입력받아서 4가지 관계연산자의 결과를 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 10 
각각의 경우에 대해 참이라면 1을, 거짓이라면 0을 출력합니다.
첫 번째 줄에는 a가 b보다 같거나 큰지,
두 번째 줄에는 a가 b보다 큰지,
세 번째 줄에는 b가 a보다 같거나 큰지,
네 번째 줄에는 b가 a보다 큰지에 대한 결과를 출력합니다.*/

import java.util.Scanner;

public class Ex_093 {
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
		
	}
}