/*정수 a의 값과 정수 b, c, d, e의 값이 주어질 때, 정수 a가 나머지정수와 비교해서 크기가 크다면 1을, 크지 않다면 0을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 a의 값이 주어집니다.
두 번째 줄에 b, c, d, e의 값이 순서대로 공백을 두고 주어집니다.
1 ≤ a, b, c, d, e ≤ 100 
첫 번째 줄에 a가 b보다 크다면 1을, 크지 않다면 0을 출력합니다.
두 번째 줄에 a가 c보다 크다면 1을, 크지 않다면 0을 출력합니다.
세 번째 줄에 a가 d보다 크다면 1을, 크지 않다면 0을 출력합니다.
네 번째 줄에 a가 e보다 크다면 1을, 크지 않다면 0을 출력합니다. */

import java.util.Scanner;

public class Ex_094 {
	public static void main(String[] args) {
		System.out.println("정수 a, b, c ,d ,e의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d, e;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		d = scanner.nextInt();	
		e = scanner.nextInt();	
		
		if (a > b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > d) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a > e) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}