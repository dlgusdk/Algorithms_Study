/*두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 100
큰 수에서 작은 수를 뺀 값을 출력합니다.*/

import java.util.Scanner;

public class Ex_070 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");
		
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if (x > y) {
			System.out.printf("%d", x-y);			
		}// if문 속의 실행문이 한 줄이므로 생략 가능.
		
		if (x < y)
			System.out.printf("%d", y-x);		

		if (x == y) {
			System.out.printf("%d", x-y);			
		}
	}
}