/*세 수 a, b, c의 값이 주어졌을 때, b가 a보다 크고 c보다 작다면 1을, 그렇지 않다면 0을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 a, b, c 값을 순서대로 공백을 두고 주어집니다.
1 ≤ a, b, c ≤ 100 
b가 a보다 크고 c보다 작다면 1을, 그렇지 않다면 0을 출력하는 프로그램을 작성해보세요. */

import java.util.Scanner;

public class Ex_100 {
	public static void main(String[] args) {
		System.out.println("정수 a, b, c의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		
		if (a < b && b < c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}