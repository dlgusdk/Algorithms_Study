/*3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수 중 최솟값을 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b, c가 공백을 사이에 두고 주어집니다.
-100 ≤ a, b, c ≤ 100
입력받은 3개의 정수 중 최솟값을 출력합니다.*/

import java.util.Scanner;

public class Ex_099 {
	public static void main(String[] args) {
		System.out.println("정수 a, b, c의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		
		if (a <= b && a <= c) {
			System.out.println(a);
		} else if (b <= a && b <= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}